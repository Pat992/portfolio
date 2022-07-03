import { useAnimation, Variants, motion } from 'framer-motion';
import { useEffect, useState } from 'react';
import { useAppSelector } from '../../store/hooks';
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
        scale: 1,
        opacity: 1,
        top: '1vh',
        bottom: 'auto',
        left: '1vw',
        width: '30vh',
        height: 'calc(3rem + 1vw)',
        position: 'relative',
        transition: {
            duration: 0.5,
            type: 'spring'
        }
    },
    leaveMain: {
        opacity: 1,
        top: 'auto',
        bottom: 20,
        left: 'calc(90vw - 3rem + 1vw)',
        scale: 1,
        right: 0,
        width: 'calc(3rem + 1vw)',
        height: 'calc(3rem + 1vw)',
        position: 'fixed',
        transition: {
            duration: 0.5,
            type: 'spring'
        }
    },
    enterFooter: {
        left: 'calc(50vw - 50%)',
        top: 'calc(70vh - 5rem + 1vw)',
        width: '30vh',
        transition: {
            duration: 0.5,
            type: 'spring'
        }
    },
    hover: {
        scale: 1.1,
        boxShadow: "0px 0px 8px rgb(255,255,255)",
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
                controls.start('leaveMain');
                setShowSvg(true);
            }
            else if (inMainViewport) {
                controls.start('enterMain');
                setShowSvg(false);
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
        <motion.button variants={buttonVariants} initial='from' animate={controls} className="btn contact-button" whileHover='hover' layout>
            {showSvg ? <MailSvg /> : 'CONTACT ME'}
        </motion.button>
    );
};

export default ContactButton;