import { motion, useTransform, useViewportScroll } from 'framer-motion';
import { useAppDispatch } from '../../store/hooks';
import { setSkills } from '../../store/navigation-slice';
import AzureSkill from '../UI/SkillCircles/AzureSkill';
import BiztalkSkill from '../UI/SkillCircles/BiztalkSkill';
import FlutterSkill from '../UI/SkillCircles/FlutterSkill';
import NodeSkill from '../UI/SkillCircles/NodeSkill';
import ReactSkill from '../UI/SkillCircles/ReactSkill';
import './styles.scss';

interface SkillsProps { };
const Skills: React.FC<SkillsProps> = () => {
    const { scrollYProgress } = useViewportScroll();
    const scroll = useTransform(scrollYProgress, [0.8, 0.9], [5, 3]);
    const dispatch = useAppDispatch();

    return (
        <motion.section id='skills' className="skills" onViewportEnter={() => dispatch(setSkills())} viewport={{ amount: 0.5 }}>
            <motion.div className='skills-bkg bkg' style={{ rotate: scroll }} />
            <h2 className='title'>SKILLS &amp; EXPERIENCE</h2>
            <div className='skill-body'>
                <div className='expirience-list'>
                    <ul>
                        <li>
                            <p>2021 - Now</p>
                            <div>
                                <h3>Developer III</h3>
                                <h3 className='main-color'>QUIBIQ AG</h3>
                            </div>
                        </li>
                        <li>
                            <p>2020 - 2021</p>
                            <div>
                                <h3>Developer I</h3>
                                <h3 className='main-color'>QUIBIQ AG</h3>
                            </div>
                        </li>
                        <li>
                            <p>2019 - 2020</p>
                            <div>
                                <h3>Web Developer</h3>
                                <h3 className='main-color'>Andeo AG</h3>
                            </div>
                        </li>
                        <li>
                            <p>2019 - 2021</p>
                            <div>
                                <h3>Computer science EFZ</h3>
                                <h3 className='main-color'>ZLI: Zurich Training Association ICT</h3>
                            </div>
                        </li>
                        <li>
                            <p>2017 - 2020</p>
                            <div>
                                <h3>Computer science HAF</h3>
                                <h3 className='main-color'>Hamburg Academy for distance learning</h3>
                            </div>
                        </li>
                    </ul>
                </div>
                <div className='skill-list'>
                    <ul>
                        <li>
                            <FlutterSkill />
                        </li>
                        <li>
                            <NodeSkill />
                        </li>
                        <li>
                            <AzureSkill />
                        </li>
                        <li>
                            <ReactSkill />
                        </li>
                        <li>
                            <BiztalkSkill />
                        </li>
                    </ul>
                </div>
            </div>
        </motion.section>
    );
};

export default Skills;