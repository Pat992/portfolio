import { ReactNode } from "react";
import { motion } from 'framer-motion';
import './styles.scss';

interface SkillCircleProps {
    color: string,
    body: ReactNode,
    text?: string
};
const SkillCircle: React.FC<SkillCircleProps> = ({ color, body, text = '' }) => {

    return (
        <motion.div
            className="skill"
            drag
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