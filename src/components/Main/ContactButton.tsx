import { useAnimation, Variants, motion } from 'framer-motion';
import { useEffect, useState } from 'react';
import { useAppDispatch, useAppSelector } from '../../store/hooks';
import { setShowModal } from '../../store/modal-slice';
import MailSvg from './MailSvg';
import './styles.scss';

const buttonVariants: Variants = {
    from: {
        scale: 1,
        left: '100vw',
        top: '10vh',
        opacity: 0,
    },
    enterMain: {
        position: 'relative',
        opacity: 1,
        right: 'auto',
        bottom: 'auto',
        top: '1vh',
        minHeight: '4vh',
        left: 0,
        width: '30vh',
        height: 'calc(4rem + 1vw)',
        transition: {
            duration: 0.5,
            type: 'spring'
        }
    },
    leaveMain: {
        position: 'fixed',
        top: 'auto',
        left: 'auto',
        bottom: 30,
        right: 10,
        minWidth: '4vh',
        width: 'calc(3rem + 1vw)',
        height: 'calc(3rem + 1vw)',
        transition: {
            duration: 0.5,
            type: 'spring'
        }
    },
    enterFooter: {
        left: 'calc(50vw - 50%)',
        top: 'calc(60vh - 5rem + 1vw)',
        width: '30vh',
        minHeight: '4vh',
        transition: {
            duration: 0.5,
            type: 'spring'
        }
    },
    hover: {
        y: -2
    }
};

interface ContactButtonProps { };
const ContactButton: React.FC<ContactButtonProps> = () => {
    const [showSvg, setShowSvg] = useState(false);
    const inMainViewport = useAppSelector((state) => state.main.inViewport);
    const hasEnteredProjects = useAppSelector((state) => state.projects.hasEnteredVP);
    const scroll = useAppSelector((state) => state.doc.value);
    const hasDoneIconAnim = useAppSelector((state) => state.main.hasDoneIconAnim);
    const controls = useAnimation();
    const dispatch = useAppDispatch();

    useEffect(() => {
        controls.set('from');
    }, []);

    useEffect(() => {
        if (hasDoneIconAnim) {
            controls.start('enterMain');
        } else {
            controls.start('from');
        }
    }, [hasDoneIconAnim]);

    useEffect(() => {
        if (hasDoneIconAnim) {
            if (hasEnteredProjects) {
                setShowSvg(true);
                controls.start('leaveMain');
            }
            else if (inMainViewport) {
                setShowSvg(false);
                controls.start('enterMain');
            } else if (scroll > 0.97) {
                controls.start('enterFooter');
                setShowSvg(false);
            } else if (scroll < 0.97) {
                setShowSvg(true);
                controls.start('leaveMain');
            }
        }
    }, [inMainViewport, hasEnteredProjects, scroll, hasDoneIconAnim]);

    return (
        <motion.button
            onClick={() => dispatch(setShowModal(true))}
            variants={buttonVariants}
            initial='from'
            animate={controls}
            className="btn contact-button"
            whileHover='hover'
            whileTap='hover'
            layout
        >
            {showSvg ? <MailSvg /> : 'CONTACT ME'}
        </motion.button>
    );
};

export default ContactButton;