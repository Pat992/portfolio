import { motion, Variants } from 'framer-motion';
import Icon from './IconSvg';
import './styles.scss';

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
            <div><Icon /></div>
            <ul>
                <motion.li variants={liVariants} initial='from' animate='to' whileHover='hover'><a href="#">HOME</a></motion.li>
                <motion.li variants={liVariants} initial='from' animate='to' whileHover='hover'><a href="#">PROJECTS</a></motion.li>
                <motion.li variants={liVariants} initial='from' animate='to' whileHover='hover'><a href="#">SKILLS</a></motion.li>
            </ul>
        </nav>
    );
};

export default Nav