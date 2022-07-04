import { ButtonHTMLAttributes } from "react";

interface ButtonProps {
    onClick: Function,
    body: any,
    type?: any,
    isCancel: boolean
};
const Button: React.FC<ButtonProps> = ({ onClick, body, type, isCancel }) => {
    return (
        <button className={isCancel ? 'cancel' : ''} type={type || 'button'} onClick={() => onClick()}>{body}</button>
    );
};

export default Button;