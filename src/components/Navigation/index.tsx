import { AnimatePresence, AnimateSharedLayout, motion, useAnimation, Variants } from 'framer-motion';
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

const aVariants: Variants = {
    from: {},
    to: {},
    hover: {
        className: 'hover'
    }
}


interface NavProps { };
const Nav: React.FC<NavProps> = () => {
    const [selected, setSelected] = useState(-1);
    const hasDoneIconAnim = useAppSelector((state) => state.main.hasDoneIconAnim);
    const controls = useAnimation();

    useEffect(() => {
        controls.set('from');
    }, []);

    useEffect(() => {
        if (hasDoneIconAnim) {
            controls.start('to');
        } else {
            controls.start('from');
        }
    }, [hasDoneIconAnim]);

    return (
        <nav>
            {/* <ul>
                <motion.li variants={liVariants} initial='to' animate={controls} whileHover='hover'>
                    <motion.a variants={aVariants} whileHover='hover' className='active' href="#">HOME</motion.a>
                </motion.li>
                <motion.li variants={liVariants} initial='to' animate={controls} whileHover='hover'>
                    <a href="#">PROJECTS</a>
                </motion.li>
                <motion.li variants={liVariants} initial='to' animate={controls} whileHover='hover'>
                    <a href="#">SKILLS</a>
                </motion.li>
            </ul>
            <motion.div variants={liVariants} initial='from' animate={controls}>
                <ToggleButton />
            </motion.div> */}
            <motion.div className="navigation">
                <ul className="wrapper">
                    <motion.li variants={liVariants} initial='to' animate={controls}>
                        <NavigationItem
                            child={<a href="#">HOME</a>}
                            key={0}
                            selected={selected === 0}
                            onHover={() => setSelected(0)}
                            onLeave={() => setSelected(-1)}
                        />
                    </motion.li>
                    <motion.li variants={liVariants} initial='to' animate={controls}>
                        <NavigationItem
                            child={<a href="#projects">PROJECTS</a>}
                            key={1}
                            selected={selected === 1}
                            onHover={() => setSelected(1)}
                            onLeave={() => setSelected(-1)}
                        />
                    </motion.li>
                    <motion.li variants={liVariants} initial='to' animate={controls}>
                        <NavigationItem
                            child={<a href="#skills">SKILLS</a>}
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