import { motion, useAnimation, Variants } from 'framer-motion';
import { useEffect } from 'react';
import { useAppDispatch, useAppSelector } from '../../store/hooks';
import { setHasEnteredMain, setHasLeftMain } from '../../store/main-slice';
import ContactButton from './ContactButton';
import './styles.scss';
import SvgShapes from './SvgShapes';

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
            duration: 1,
        }
    }
}

interface MainProps { };
const Main: React.FC<MainProps> = () => {
    const dispatch = useAppDispatch();
    const controls = useAnimation();
    const hasDoneIcon = useAppSelector((state) => state.main.hasDoneIconAnim);

    useEffect(() => {
        controls.set('from');
    }, []);

    useEffect(() => {
        if (hasDoneIcon) {
            console.log('done')
            controls.start('to');
        } else {
            controls.start('from');
        }
    }, [hasDoneIcon]);

    return (
        <motion.section className='main' onViewportEnter={() => dispatch(setHasEnteredMain())} onViewportLeave={() => dispatch(setHasLeftMain())}>
            <motion.div className='introduction'>
                <motion.h4 animate={controls} variants={textVariants} >Patrick Hettich</motion.h4>
                <motion.h1 animate={controls} variants={textVariants} >software developer \</motion.h1>
                <motion.h1 animate={controls} variants={textVariants} className='title-2'>cloud engineer</motion.h1>
                <ContactButton />
            </motion.div>
            <div className='graphic'><SvgShapes /></div>
        </motion.section>
    );
};

export default Main;