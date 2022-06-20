import { motion, useTransform, useViewportScroll } from 'framer-motion';
import './styles.scss';

interface SkillsProps { };
const Skills: React.FC<SkillsProps> = () => {
    const { scrollYProgress } = useViewportScroll();
    const scroll = useTransform(scrollYProgress, [0.9, 1], [10, 3]);

    return (
        <section className="skills">
            <motion.div className='skills-bkg bkg' style={{ rotate: scroll }} />
            <h2>SKILLS</h2>
        </section>
    );
};

export default Skills;