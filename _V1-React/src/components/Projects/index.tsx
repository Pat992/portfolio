import { motion, Variants } from 'framer-motion';
import { useState } from 'react';
import { useAppDispatch } from '../../store/hooks';
import { setProjects } from '../../store/navigation-slice';
import { setHasEnteredProjects, setHasLeftProjcets } from '../../store/projects-slice';
import AdWave from "./Adwave/Adwave";
import AndFm from "./AndFm/AndFm";
import './styles.scss';
// TODO: add variants here and send them to the projects
const inViewVariants: Variants = {
    from: {
        y: 0,
        x: 500,
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
    const [isDoneAdWaveAnim, setIsDoneAdWaveAnim] = useState(false);
    const [isDoneAndFmAnim, setIsDoneAndFmAnim] = useState(false);
    const dispatch = useAppDispatch();

    return (
        <motion.section
            id='projects'
            className="projects"
            onViewportEnter={() => {
                dispatch(setHasEnteredProjects());
                dispatch(setProjects());
            }}
            onViewportLeave={() => dispatch(setHasLeftProjcets())}
        >
            <h2>PROJECTS</h2>
            <motion.div
                className='project'
                variants={inViewVariants}
                initial={{ y: 0, x: -50, opacity: 0 }}
                whileInView='to'
                viewport={{ once: false, amount: 0.5 }}
                onAnimationStart={() => setIsDoneAdWaveAnim(() => false)}
                onAnimationComplete={() => setIsDoneAdWaveAnim(() => true)}>
                <AdWave startAnimation={isDoneAdWaveAnim} />
            </motion.div>
            <motion.div
                className='project'
                variants={inViewVariants}
                initial={{ y: 0, x: 50, opacity: 0 }}
                viewport={{ once: false, amount: 0.5 }}
                whileInView='to'
                onAnimationStart={() => setIsDoneAndFmAnim(() => false)}
                onAnimationComplete={() => setIsDoneAndFmAnim(() => true)}>
                <AndFm startAnimation={isDoneAndFmAnim} />
            </motion.div>
        </motion.section>
    );
};

export default Projects;