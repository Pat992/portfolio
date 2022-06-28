import SkillCircle from ".";
import ReactSvg from "../SVGs/ReactSvg";

interface ReactSkillProps { };
const ReactSkill: React.FC<ReactSkillProps> = () => {
    return (
        <SkillCircle color="rgba(0, 216, 255, 0.2)" body={<ReactSvg />} />
    );
};

export default ReactSkill;