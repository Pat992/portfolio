import { useAnimation, Variants, motion } from 'framer-motion';
import { useAppSelector } from '../../store/hooks';
import Github from "./Github";
import Linkedin from "./Linkedin";

const sidebarVariants: Variants = {
    from: {
        top: 'auto',
        bottom: 20,
        left: 5,
        flexDirection: 'column',
        transition: {
            duration: 0.5,
            type: 'spring',
        }
    },
    inFooter: {
        top: 'calc(85vh - 1rem)',
        width: '20vh',
        left: 'calc(50vw - 10vh)',
        flexDirection: 'row',
        justifyContent: 'space-between',
        transition: {
            duration: 0.5,
            type: 'spring'
        }
    },
};

interface ConnectionSidebarProps { };
const ConnectionSidebar: React.FC<ConnectionSidebarProps> = () => {
    const scroll = useAppSelector((state) => state.doc.value);
    const controls = useAnimation();

    if (scroll > 0.97) {
        controls.start('inFooter');
    } else if (scroll < 0.97) {
        controls.start('from');
    }

    return (
        <motion.aside className="sidebar" variants={sidebarVariants} animate={controls} initial='from'>
            <a href="https://github.com/Pat992" target='_blank' rel="noreferrer"><Github /></a>
            <a href="https://www.linkedin.com/in/patrick-hettich/" target='_blank' rel="noreferrer"><Linkedin /></a>
        </motion.aside>
    );
};

export default ConnectionSidebar;