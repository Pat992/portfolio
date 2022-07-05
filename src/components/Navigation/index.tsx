import { motion, useAnimation, Variants } from 'framer-motion';
import { useEffect, useState } from 'react';
import { useAppSelector } from '../../store/hooks';
import NavigationItem from './NavigationItem';
import './styles.scss';
import ToggleButton from './ToggleButton';

const liVariants: Variants = {
    from: {
        x: '100vw',
    },
    to: {
        x: 0,
        transition: {
            duration: 0.5,
        }
    },
    hover: {}
}

interface NavProps { };
const Nav: React.FC<NavProps> = () => {
    const [selected, setSelected] = useState(-1);
    const hasDoneIconAnim = useAppSelector((state) => state.main.hasDoneIconAnim);
    const navigationHome = useAppSelector((state) => state.navigation.home);
    const navigationProjects = useAppSelector((state) => state.navigation.projects);
    const navigationSkills = useAppSelector((state) => state.navigation.skills);
    const home = document.getElementById('home');
    const projects = document.getElementById('projects');
    const skills = document.getElementById('skills');
    const controls = useAnimation();

    if (hasDoneIconAnim) {
        controls.start('to');
    } else {
        controls.start('from');
    }

    return (
        <nav className={hasDoneIconAnim ? 'bkg-transparent bkg-bottom-border' : ''}>
            <motion.div className="navigation">
                <ul className="wrapper">
                    <motion.li variants={liVariants} initial='to' animate={controls}>
                        <NavigationItem
                            child={<a className={navigationHome ? 'active' : ''} onClick={() => home?.scrollIntoView()}>HOME</a>}
                            key={0}
                            selected={selected === 0}
                            onHover={() => setSelected(0)}
                            onLeave={() => setSelected(-1)}
                        />
                    </motion.li>
                    <motion.li variants={liVariants} initial='to' animate={controls}>
                        <NavigationItem
                            child={<a className={navigationProjects ? 'active' : ''} onClick={() => projects?.scrollIntoView()}>PROJECTS</a>}
                            key={1}
                            selected={selected === 1}
                            onHover={() => setSelected(1)}
                            onLeave={() => setSelected(-1)}
                        />
                    </motion.li>
                    <motion.li variants={liVariants} initial='to' animate={controls}>
                        <NavigationItem
                            child={<a className={navigationSkills ? 'active' : ''} onClick={() => skills?.scrollIntoView()}>SKILLS</a>}
                            key={2}
                            selected={selected === 2}
                            onHover={() => setSelected(2)}
                            onLeave={() => setSelected(-1)}
                        />
                    </motion.li>
                </ul>
            </motion.div>
            <motion.div variants={liVariants} initial='from' animate={controls}>
                <ToggleButton />
            </motion.div>
        </nav>
    );
};

export default Nav