import { motion, useAnimation, Variants } from 'framer-motion';
import { useEffect } from 'react';
import { useAppDispatch, useAppSelector } from '../../store/hooks';
import { setHasEnteredMain, setHasLeftMain } from '../../store/main-slice';
import { setMain } from '../../store/navigation-slice';
import ContactButton from './ContactButton';
import './styles.scss';
import SvgShapes from './SvgShapes';

const mainVariants: Variants = {
    from: {},
    to: {
        transition: {
            when: 'beforeChildren',
            staggerChildren: 0.5
        }
    }
};

const textVariants: Variants = {
    from: {
        y: '10vh',
        opacity: 0
    },
    to: {
        y: 0,
        opacity: 1,
        transition: {
            type: 'easeOut',
        }
    }
}

interface MainProps { };
const Main: React.FC<MainProps> = () => {
    const dispatch = useAppDispatch();
    const controls = useAnimation();
    const hasDoneIcon = useAppSelector((state) => state.main.hasDoneIconAnim);

    useEffect(() => {
        if (hasDoneIcon) {
            controls.start('to');
        } else {
            controls.start('from');
        }
    }, [hasDoneIcon, controls]);

    return (
        <motion.section
            id='home'
            animate={controls}
            variants={mainVariants}
            className='main'
            onViewportEnter={() => {
                dispatch(setHasEnteredMain());
                dispatch(setMain());
            }}
            onViewportLeave={() => dispatch(setHasLeftMain())}
        >
            <motion.div className='introduction'>
                <motion.h4 variants={textVariants} >Patrick Hettich</motion.h4>
                <motion.h1 variants={textVariants} >software developer \</motion.h1>
                <motion.h1 variants={textVariants} className='title-2'>data engineer</motion.h1>
                <ContactButton />
            </motion.div>
            <div className='graphic'><SvgShapes /></div>
        </motion.section>
    );
};

export default Main;