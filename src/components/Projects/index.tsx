import { motion, Variants } from 'framer-motion';
import AdWave from "./Adwave/Adwave";
import AndFm from "./AndFm/And-fm";

const inViewVariants: Variants = {
    from: {
        y: '100px',
        x: '10px',
        opacity: 0
    },
    to: {
        y: 0,
        x: 0,
        opacity: 1,
        transition: {
            duration: 0.5
        }
    }
};

interface ProjectsProps { };
const Projects: React.FC<ProjectsProps> = () => {
    return (
        <section className="projects">
            <h2>PROJECTS</h2>
            <motion.div className='project' variants={inViewVariants} initial='from' whileInView='to' viewport={{ once: false, amount: 0.5 }}><AdWave /></motion.div>
            <motion.div className='project' variants={inViewVariants} initial='from' whileInView='to' viewport={{ once: false, amount: 0.5 }}><AndFm /></motion.div>
        </section>
    );
};

export default Projects;