import { motion, Variants } from 'framer-motion';
import Icon from '../UI/IconSvg';
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

const svgVariants: Variants = {
    from: {
        originY: '50%',
        originX: '50%',
        y: 'calc(50vh - 100%)',
        x: 'calc(50vw - 100%)',
        scale: 5,
    },
    to: {
        y: 0,
        x: 0,
        scale: 1,
        originY: '50%',
        originX: '50%',
        transition: {
            duration: 0.5,
            type: 'easeInOut'
        }
    }
};


interface NavProps { };
const Nav: React.FC<NavProps> = () => {
    return (
        <nav>
            <div><Icon animationVariants={svgVariants} onAnimationComepleteHandler={() => { }} /></div>
            <ul>
                <motion.li variants={liVariants} initial='from' animate='to' whileHover='hover'><a href="#">HOME</a></motion.li>
                <motion.li variants={liVariants} initial='from' animate='to' whileHover='hover'><a href="#">PROJECTS</a></motion.li>
                <motion.li variants={liVariants} initial='from' animate='to' whileHover='hover'><a href="#">SKILLS</a></motion.li>
            </ul>
            <ToggleButton />
        </nav>
    );
};

export default Nav