import { useAppDispatch } from '../../store/hooks';
import { motion, Variants } from 'framer-motion';
import './styles.scss';
import { setHasEnteredFooter, setHasLeftFooter } from '../../store/footer-slice';

interface FooterProps { };
const Footer: React.FC<FooterProps> = () => {
    const dispatch = useAppDispatch();

    return (
        <motion.footer className="footer card" onViewportEnter={() => dispatch(setHasEnteredFooter())} onViewportLeave={() => dispatch(setHasLeftFooter())}>
            <h2>Let's talk!</h2>
        </motion.footer>
    );
};

export default Footer;