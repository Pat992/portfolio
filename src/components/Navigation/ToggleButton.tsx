import { motion } from "framer-motion";
import { useAppDispatch, useAppSelector } from "../../store/hooks";
import { setIsDarkTheme } from "../../store/theme-slice";
import './styles.scss';

interface ToggleButtonProps { };
const ToggleButton: React.FC<ToggleButtonProps> = () => {
    const isDarkTheme = useAppSelector((state) => state.theme.isDarkTheme);
    const dispatch = useAppDispatch();

    return (
        <motion.div animate className={`switch ${isDarkTheme ? "on" : "off"}`} onClick={() => dispatch(setIsDarkTheme(!isDarkTheme))}>
            <motion.div animate />
        </motion.div>
    );
};

export default ToggleButton;