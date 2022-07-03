import { motion, useAnimation, Variants } from 'framer-motion';
import { useEffect } from 'react';
import { useAppSelector } from '../../store/hooks';
import './styles.scss';
import ToggleButton from './ToggleButton';

const liVariants: Variants = {
    from: {
        x: '100vw',
    },
    to: {
        x: 0,
        transition: {
            duration: 0.5,
        }
    },
    hover: {
        scale: 1.1
    }
}


interface NavProps { };
const Nav: React.FC<NavProps> = () => {
    const hasDoneIconAnim = useAppSelector((state) => state.main.hasDoneIconAnim);
    const controls = useAnimation();

    useEffect(() => {
        controls.set('from');
    }, []);

    useEffect(() => {
        if (hasDoneIconAnim) {
            controls.start('to');
        } else {
            controls.start('from');
        }
    }, [hasDoneIconAnim]);

    return (
        <nav>
            <ul>
                <motion.li variants={liVariants} initial='from' animate={controls} whileHover='hover'><a href="#">HOME</a></motion.li>
                <motion.li variants={liVariants} initial='from' animate={controls} whileHover='hover'><a href="#">PROJECTS</a></motion.li>
                <motion.li variants={liVariants} initial='from' animate={controls} whileHover='hover'><a href="#">SKILLS</a></motion.li>
            </ul>
            <motion.div variants={liVariants} initial='from' animate={controls}>
                <ToggleButton />
            </motion.div>
        </nav>
    );
};

export default Nav