import { motion } from 'framer-motion';
import Icon from './Icon';
import './styles.scss';

const ulVariants = {
    from: {},
    to: {
        transition: {
            when: 'beforeChildren',
            staggerChildren: 0.4
        }
    }
}

const liVariants = {
    from: {
        x: '100vw',
    },
    to: {
        x: 0,
        transition: {
            duration: 0.5,
        }
    }
}

interface NavProps { };
const Nav: React.FC<NavProps> = () => {
    return (
        <nav>
            <div><Icon /></div>
            <motion.ul variants={ulVariants} initial='from' animate='to'>
                <motion.li variants={liVariants}><a href="#">HOME</a></motion.li>
                <motion.li variants={liVariants}><a href="#">PROJECTS</a></motion.li>
                <motion.li variants={liVariants}><a href="#">SKILLS</a></motion.li>
            </motion.ul>
        </nav>
    );
};

export default Nav