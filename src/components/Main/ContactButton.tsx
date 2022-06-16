import { useAnimation, Variants, motion } from 'framer-motion';
import { useEffect, useState } from 'react';
import { useAppSelector } from '../../store/hooks';
import MailSvg from './MailSvg';
import './styles.scss';

interface ContactButtonProps { };
const ContactButton: React.FC<ContactButtonProps> = () => {
    const [showSvg, setShowSvg] = useState(false);
    const inMainViewport = useAppSelector((state) => state.main.inViewport);
    const hasEnteredProjects = useAppSelector((state) => state.projects.hasEnteredVP);
    const controls = useAnimation();

    const buttonVariants: Variants = {
        from: {
            scale: 1,
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
            scale: 1,
            right: 0,
            width: '7vh',
            position: 'fixed',
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

    useEffect(() => {
        if (hasEnteredProjects === true) {
            controls.start('leaveMain');
            setShowSvg(true);
        }
        else if (inMainViewport === true) {
            controls.start('enterMain');
            setShowSvg(false);
        }
    }, [inMainViewport, hasEnteredProjects])

    return (
        <motion.button variants={buttonVariants} initial='enterMain' animate={controls} className="btn contact-button" whileHover='hover' layout>
            {showSvg ? <MailSvg /> : 'CONTACT ME'}
        </motion.button>
    );
};

export default ContactButton;