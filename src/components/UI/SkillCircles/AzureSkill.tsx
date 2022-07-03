import SkillCircle from ".";
import AzureSvg from "../SVGs/AzureSvg";

interface AzureSkillProps { };
const AzureSkill: React.FC<AzureSkillProps> = () => {
    return (
        <SkillCircle color="rgba(3, 91, 218, 0.2)" body={<AzureSvg />} text='Azure' />
    );
};

export default AzureSkill;