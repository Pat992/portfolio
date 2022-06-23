import { ReactNode, useEffect } from "react";
import { motion, useAnimation, Variants } from 'framer-motion';
import './styles.scss';
import { useAppSelector } from "../../../store/hooks";

interface SkillCircleProps {
    color: string,
    body: ReactNode
};
const SkillCircle: React.FC<SkillCircleProps> = ({ color, body }) => {
    const controls = useAnimation();
    const inMainViewport = useAppSelector((state) => state.main.inViewport);
    const hasEnteredProjects = useAppSelector((state) => state.projects.hasEnteredVP);
    const right = Math.floor(Math.random() * 20) + 40;
    const top = Math.floor(Math.random() * 80);

    const skillCircleVariants: Variants = {
        from: {
            scale: 0,
            opacity: 0,
            right: '-200vw',
            top: '50%',
        },
        to: {
            right: `${right}vw`,
            top: `${top}vh`,
            scale: 1,
            opacity: 1,
            transition: {
                duration: 1,
                type: 'spring',
            }
        }
    };


    useEffect(() => {
        const timer = setTimeout(() => {
            controls.start('to');
        }, 1000);
        return () => clearTimeout(timer);
    }, []);

    useEffect(() => {
        if (hasEnteredProjects) {
            controls.start('from');
        }
        else if (inMainViewport) {
            controls.start('to');
        }
    }, [inMainViewport, hasEnteredProjects]);

    return (
        <motion.div
            drag
            dragSnapToOrigin
            dragElastic={1}
            variants={skillCircleVariants}
            initial='from'
            animate={controls}
            style={{ background: color }}
            className="skill-circle bkg"
        >
            {body}
        </motion.div>
    );
};

export default SkillCircle;