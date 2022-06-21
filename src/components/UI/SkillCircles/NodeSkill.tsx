import { MutableRefObject } from "react";
import SkillCircle from ".";
import NodeSvg from "./NodeSvg";

interface NodeSkillProps { };
const NodeSkill: React.FC<NodeSkillProps> = () => {
    return (
        <SkillCircle color="rgba(83, 158, 67, 0.2)" body={<NodeSvg />} />
    );
};

export default NodeSkill;