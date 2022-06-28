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


interface NavProps { };
const Nav: React.FC<NavProps> = () => {
    return (
        <nav>
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