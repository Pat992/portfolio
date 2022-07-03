import { useAnimation, Variants, motion } from 'framer-motion';
import { useEffect } from 'react';
import { useAppSelector } from '../../store/hooks';
import Github from "./Github";
import Linkedin from "./Linkedin";

const sidebarVariants: Variants = {
    from: {
        top: 'auto',
        bottom: 20,
        left: '2vw',
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
    }
};

interface ConnectionSidebarProps { };
const ConnectionSidebar: React.FC<ConnectionSidebarProps> = () => {
    const scroll = useAppSelector((state) => state.doc.value);
    const controls = useAnimation();

    useEffect(() => {
        if (scroll > 0.97) {
            controls.start('inFooter');
        } else if (scroll < 0.97) {
            controls.start('from');
        }
    }, [scroll])

    return (
        <motion.aside className="sidebar" variants={sidebarVariants} animate={controls} initial='from'>
            <Github />
            <Linkedin />
        </motion.aside>
    );
};

export default ConnectionSidebar;