import { ReactNode, useEffect } from "react";
import { motion, useAnimation, Variants } from 'framer-motion';
import './styles.scss';

interface SkillCircleProps {
    color: string,
    body: ReactNode,
    text?: string
};
const SkillCircle: React.FC<SkillCircleProps> = ({ color, body, text = '' }) => {

    return (
        <motion.div drag
            dragSnapToOrigin
            dragElastic={1}>
            <motion.div
                style={{ background: color }}
                className="skill-circle bkg"
            >
                {body}
            </motion.div>
            {text.length > 0 && <p>{text}</p>}
        </motion.div>

    );
};

export default SkillCircle;