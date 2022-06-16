import { useAnimation, Variants, motion } from 'framer-motion';
import { useEffect } from 'react';
import { useAppSelector } from '../../store/hooks';
import MailSvg from './MailSvg';
import './styles.scss';

interface ContactButtonProps { };
const ContactButton: React.FC<ContactButtonProps> = () => {
    const inMainViewport = useAppSelector((state) => state.main.inViewport);
    const hasEnteredProjects = useAppSelector((state) => state.projects.hasEnteredVP);
    const controls = useAnimation();

    const buttonVariants: Variants = {
        from: {
            scale: 0,
            //position: 'relative'
        },
        enterMain: {
            scale: 1,

            top: '1vh',
            left: '1vw',
            width: '30vh',
            height: '7vh',
            position: 'relative',
            transition: {
                duration: 0.5,
                type: 'spring'
            }
        },
        leaveMain: {
            top: 'calc(90vh - 10vh)',
            left: 'calc(95vw - 10vh)',
            right: 0,
            width: '7vh',
            position: 'fixed',
            transition: {
                duration: 0.5,
                type: 'spring'
            }
        }
    };

    useEffect(() => {
        if (hasEnteredProjects === true) {
            controls.start('leaveMain');
        }
        else if (inMainViewport === true) {
            controls.start('enterMain');
        }
    }, [inMainViewport, hasEnteredProjects])

    return (
        <motion.button variants={buttonVariants} initial='from' animate={controls} className="contact-button" layout>
            {hasEnteredProjects ? <MailSvg /> : 'CONTACT ME'}
        </motion.button>
    );
};

export default ContactButton;