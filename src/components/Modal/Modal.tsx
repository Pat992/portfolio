import { AnimatePresence, motion, Variants } from "framer-motion";
import { FormEvent, Fragment, useEffect, useRef, useState } from "react";
import emailjs from '@emailjs/browser';
import { useAppDispatch, useAppSelector } from "../../store/hooks";
import { setShowModal } from "../../store/modal-slice";
import './styles.scss';
import LoadingSvg from "./LoadingSvg";

const backdropVariants: Variants = {
    from: {
        opacity: 0
    },
    to: {
        opacity: 1
    }
};

const modalVariants: Variants = {
    from: {
        y: '-100vh',
        opacity: 0
    },
    to: {
        y: '10vh',
        opacity: 1,
        transition: { delay: 0.5 }
    }
};

interface ModalProps { };
const Modal: React.FC<ModalProps> = () => {
    const [isLoading, setIsLoading] = useState(true);
    const dispatch = useAppDispatch();
    const showModal = useAppSelector((state) => state.modal.showModal);
    const form = useRef(null);

    useEffect(() => {
        console.log(showModal);
    }, [showModal]);

    const sendEmail = (e: FormEvent) => {
        e.preventDefault();

        if (form.current !== null) {
            emailjs.sendForm('service_td928r5', 'template_kegh07c', form.current, 'FmDwq3RDXB_tZZNm0')
                .then((result) => {
                    console.log(result.text);
                }, (error) => {
                    console.log(error.text);
                });
        }
    };

    return (
        <AnimatePresence exitBeforeEnter>
            {showModal &&
                <motion.div className='backdrop' variants={backdropVariants} animate='to' initial='from' exit='from'>
                    <motion.div className='modal' variants={modalVariants}>
                        {
                            isLoading ? <LoadingSvg /> :
                                <form ref={form} onSubmit={sendEmail}>
                                    <label htmlFor="user_name">Name</label>
                                    <input id="user_name" type="text" name="user_name" required />
                                    <label htmlFor="user_email">Email</label>
                                    <input id="user_email" type="email" name="user_email" required />
                                    <label htmlFor="message">Message</label>
                                    <textarea id="message" name="message" required />
                                    <div>
                                        <button type="submit">SEND</button>
                                        <button className="cancel" type="button" onClick={() => dispatch(setShowModal(false))}>CANCEL</button>
                                    </div>
                                </form>
                        }

                    </motion.div>
                </motion.div>
            }
        </AnimatePresence>
    );
};

export default Modal;