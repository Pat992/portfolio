import { useAnimation, Variants, motion } from 'framer-motion';
import { useEffect } from 'react';
import { useAppSelector } from '../../store/hooks';
import './styles.scss';

const buttonVariants: Variants = {
    from: {
        scale: 0,
        position: 'relative'
    },
    enterMain: {
        scale: 1,
        position: 'relative',
        x: 0,
        y: 0,
        width: '15vw',
        height: '7rem',
        transition: {
            duration: 0.5,
            type: 'spring'
        }
    },
    leaveMain: {
        position: 'fixed',
        //bottom: 0,
        x: '980%',
        y: '600%',
        width: '7rem',
        height: '7rem',
        transition: {
            duration: 0.5,
            type: 'spring'
        }
    }
};

interface ContactButtonProps { };
const ContactButton: React.FC<ContactButtonProps> = () => {
    const inMainViewport = useAppSelector((state) => state.main.inViewport);
    const hasEnteredProjects = useAppSelector((state) => state.projects.hasEnteredVP);
    const controls = useAnimation();

    useEffect(() => {
        if (hasEnteredProjects === true) {
            controls.start('leaveMain');
        }
        else if (inMainViewport === true) {
            controls.start('enterMain');
        }
    }, [inMainViewport, hasEnteredProjects])

    return (
        <motion.button variants={buttonVariants} initial='from' animate={controls} className="contact-button" layout='position'>
            CONTACT ME
        </motion.button>
    );
};

export default ContactButton;