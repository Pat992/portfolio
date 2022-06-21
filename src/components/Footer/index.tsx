import { useAppDispatch, useAppSelector } from '../../store/hooks';
import { motion, useAnimation, Variants } from 'framer-motion';
import './styles.scss';
import { setHasEnteredFooter, setHasLeftFooter } from '../../store/footer-slice';
import { useEffect } from 'react';

const footerVariants: Variants = {
    from: {
        opacity: 0,
    },
    idle: {
        opacity: 1,
        transition: {
            duration: 0.5
        }
    },
};

interface FooterProps { };
const Footer: React.FC<FooterProps> = () => {
    const dispatch = useAppDispatch();
    const scroll = useAppSelector((state) => state.doc.value);
    const controls = useAnimation();

    useEffect(() => {
        if (scroll > 0.99) {
            controls.start('idle');
        } else if (scroll < 0.99) {
            controls.start('from');
        }
    }, [scroll])

    return (
        <motion.footer variants={footerVariants} initial='from' animate={controls} className="footer card" onViewportEnter={() => dispatch(setHasEnteredFooter())} onViewportLeave={() => dispatch(setHasLeftFooter())}>
            <h2>Let's talk!</h2>
        </motion.footer>
    );
};

export default Footer;