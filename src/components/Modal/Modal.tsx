import { AnimatePresence, motion, Variants } from "framer-motion";
import { FormEvent, Fragment, useEffect, useRef, useState } from "react";
import emailjs from '@emailjs/browser';
import { useAppDispatch, useAppSelector } from "../../store/hooks";
import { setShowModal } from "../../store/modal-slice";
import LoadingSvg from "./LoadingSvg";
import LoadingContainer from "./LoadingContainer";
import './styles.scss';
import Button from "../UI/Button";

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
    const [isLoading, setIsLoading] = useState(false);
    const [isError, setIsError] = useState(false);
    const [isSuccess, setISuccess] = useState(false);
    const dispatch = useAppDispatch();
    const showModal = useAppSelector((state) => state.modal.showModal);
    const form = useRef(null);

    const resetForm = () => {
        setISuccess((_) => false);
        setIsError((_) => false);
        setIsLoading((_) => false);
    };

    useEffect(() => {
        if (!showModal) {
            resetForm();
        }
    }, [showModal]);

    const sendEmail = (e: FormEvent) => {
        if (e !== undefined) {
            e.preventDefault();
        }
        resetForm();

        setIsLoading((_) => true);

        if (form.current !== null) {
            emailjs.sendForm('service_td928r5', 'template_kegh07c', form.current, 'FmDwq3RDXB_tZZNm0')
                .then((result) => {
                    setISuccess(true);
                }, (error) => {
                    setIsError(true);
                });
        }
    };

    return (
        <AnimatePresence exitBeforeEnter>
            {showModal &&
                <motion.div className='backdrop' variants={backdropVariants} animate='to' initial='from' exit='from'>
                    <motion.div className='modal bkg' variants={modalVariants}>
                        <LoadingContainer isError={isError} isSuccess={isSuccess} isLoading={isLoading} retry={sendEmail} />
                        <form className={isLoading ? 'hidden' : ''} ref={form} onSubmit={sendEmail}>
                            <label htmlFor="user_name">Name</label>
                            <input className="bkg" id="user_name" type="text" name="user_name" required />
                            <label htmlFor="user_email">Email</label>
                            <input className="bkg" id="user_email" type="email" name="user_email" required />
                            <label htmlFor="message">Message</label>
                            <textarea className="bkg" id="message" name="message" required />
                            <div>
                                <Button body={'SEND'} isCancel={false} onClick={() => { }} type={'submit'} />
                                <Button isCancel={true} body={'CANCEL'} onClick={() => dispatch(setShowModal(false))} />
                            </div>
                        </form>
                    </motion.div>
                </motion.div>
            }
        </AnimatePresence>
    );
};

export default Modal;