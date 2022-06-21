import SkillCircle from ".";
import FlutterSvg from "./FlutterSvg";

interface FlutterSkillProps { };
const FlutterSkill: React.FC<FlutterSkillProps> = () => {
    return (
        <SkillCircle color="rgba(66, 208, 253, 0.2)" body={<FlutterSvg />} />
    );
};

export default FlutterSkill;