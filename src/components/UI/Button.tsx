import { Variants, motion } from "framer-motion";


const buttonVariants: Variants = {
    from: {
        y: 0,
    },
    hover: {
        y: -2,
    }
}

interface ButtonProps {
    onClick: Function,
    body: any,
    type?: any,
    isCancel: boolean
};
const Button: React.FC<ButtonProps> = ({ onClick, body, type, isCancel }) => {
    return (
        <motion.button
            variants={buttonVariants}
            whileHover='hover'
            whileTap='hover'
            initial='from'
            className={isCancel ? 'cancel' : ''}
            type={type || 'button'}
            onClick={() => onClick()}>
            {body}
        </motion.button>
    );
};

export default Button;