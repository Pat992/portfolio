import './styles.scss';

interface SkillsProps { };
const Skills: React.FC<SkillsProps> = () => {
    return (
        <section className="skills">
            <div className='skills-bkg bkg'></div>
            <h2>SKILLS</h2>
        </section>
    );
};

export default Skills;