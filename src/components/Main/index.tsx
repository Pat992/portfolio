import { motion, Variants } from 'framer-motion';
import { useAppDispatch } from '../../store/hooks';
import { setHasEnteredMain, setHasLeftMain } from '../../store/main-slice';
import ContactButton from './ContactButton';
import ProfileCard from './ProfileCard';
import './styles.scss';

const sectionVariants: Variants = {
    from: {
        opacity: 0
    },
    to: {
        opacity: 1,
        transition: {
            delay: 1,
            type: 'easeInOut',
            duration: 1,
            when: 'beforeChildren',
            staggerChildren: 0.4
        }
    }
}

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
    return (
        <motion.section variants={sectionVariants} initial='from' animate='to' className='main' onViewportEnter={() => dispatch(setHasEnteredMain())} onViewportLeave={() => dispatch(setHasLeftMain())}>
            <motion.div className='introduction'>
                <motion.h4 variants={textVariants}>Patrick Hettich</motion.h4>
                <motion.h1 variants={textVariants} >software developer \</motion.h1>
                <motion.h1 variants={textVariants} className='title-2'>cloud engineer</motion.h1>
                <ContactButton />
            </motion.div>
            <div className='profile'><ProfileCard /></div>
        </motion.section>
    );
};

export default Main;