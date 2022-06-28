import SkillCircle from ".";
import BiztalkSvg from "../SVGs/BiztalkSvg";

interface BiztalkSkillProps { };
const BiztalkSkill: React.FC<BiztalkSkillProps> = () => {
    return (
        <SkillCircle color="rgba(230, 50, 43, 0.3)" body={<BiztalkSvg />} />
    );
};

export default BiztalkSkill;