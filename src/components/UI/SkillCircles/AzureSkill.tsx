import { MutableRefObject } from "react";
import SkillCircle from ".";
import AzureSvg from "./AzureSvg";

interface AzureSkillProps { };
const AzureSkill: React.FC<AzureSkillProps> = () => {
    return (
        <SkillCircle color="rgba(3, 91, 218, 0.2)" body={<AzureSvg />} />
    );
};

export default AzureSkill;