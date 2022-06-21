import { ReactNode } from "react";
import './styles.scss';

interface SkillCircleProps {
    color: string,
    body: ReactNode
};
const SkillCircle: React.FC<SkillCircleProps> = ({ color, body }) => {
    return (
        <div style={{ background: color }} className="skill-circle bkg">{body}</div>
    );
};

export default SkillCircle;