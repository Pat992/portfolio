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

const loaingTxtVariants: Variants = {
    loading: {
        y: '-100vh',
        opacity: 0
    },
    error: {
        y: '10vh',
        opacity: 1,
        transition: { delay: 0.5 }
    },
    success: {

    }
};
let loadingParagraph: React.ReactNode = <p></p>;

interface ModalProps { };
const Modal: React.FC<ModalProps> = () => {
    const [isLoading, setIsLoading] = useState(false);
    const [isError, setIsError] = useState(false);
    const [isSuccess, setISuccess] = useState(false);
    const dispatch = useAppDispatch();
    const showModal = useAppSelector((state) => state.modal.showModal);
    const form = useRef(null);

    if (isLoading) {
        loadingParagraph = <p>{'Loading...'.split('').map((letter, index) => <motion.span style={{ whiteSpace: 'pre' }} key={`${index}-${letter}`} initial={{ y: 0 }} animate={{ y: 5, transition: { delay: index / 10, yoyo: Infinity } }}>{letter}</motion.span>)}</p>;
    }

    if (isError) {
        loadingParagraph = <p>{'Oh oh, error sending the message'.split('').map((letter, index) => <motion.span style={{ whiteSpace: 'pre' }} key={`${index}-${letter}`} initial={{ y: 5 }} animate={{ y: 0, transition: { delay: index / 50, duration: 0.1 } }}>{letter}</motion.span>)}</p>;
    }

    if (isSuccess) {
        loadingParagraph = <p>{'Message sent.'.split('').map((letter, index) => <motion.span style={{ whiteSpace: 'pre' }} key={`${index}-${letter}`} initial={{ y: 5 }} animate={{ y: 0, transition: { delay: index / 50, duration: 0.1 } }}>{letter}</motion.span>)}</p>;
    }

    const sendEmail = (e: FormEvent) => {
        e.preventDefault();
        setIsLoading(true);

        setTimeout(() => {
            setIsError(true);
            setTimeout(() => {
                setIsError(false);
                setISuccess(true);
            }, 5000);
        }, 5000);
        // if (form.current !== null) {
        //     emailjs.sendForm('service_td928r5', 'template_kegh07c', form.current, 'FmDwq3RDXB_tZZNm0')
        //         .then((result) => {
        //             console.log(result.text);
        //         }, (error) => {
        //             console.log(error.text);
        //         });
        // }
    };

    return (
        <AnimatePresence exitBeforeEnter>
            {showModal &&
                <motion.div className='backdrop' variants={backdropVariants} animate='to' initial='from' exit='from'>
                    <motion.div className='modal bkg' variants={modalVariants}>
                        {
                            isLoading ?
                                <div className="loading-container">
                                    <LoadingSvg isError={isError} isSuccess={isSuccess} />
                                    {loadingParagraph}
                                </div> :
                                <form ref={form} onSubmit={sendEmail}>
                                    <label htmlFor="user_name">Name</label>
                                    <input className="bkg" id="user_name" type="text" name="user_name" required />
                                    <label htmlFor="user_email">Email</label>
                                    <input className="bkg" id="user_email" type="email" name="user_email" required />
                                    <label htmlFor="message">Message</label>
                                    <textarea className="bkg" id="message" name="message" required />
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