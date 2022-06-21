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

    const skillCircleVariants: Variants = {
        from: {
            scale: 0,
            opacity: 0,
            right: '25%',
            top: '50%',
        },
        to: {
            right: `${Math.floor(Math.random() * 50) + 1}%`,
            top: `${Math.floor(Math.random() * 50) + 1}%`,
            scale: 1,
            opacity: 1,
            transition: {
                duration: 1
            }
        },
        idle: {
            translateY: [Math.floor(Math.random() * 3), Math.floor(Math.random() * 3), Math.floor(Math.random() * 3)],
            translateX: [Math.floor(Math.random() * 3), Math.floor(Math.random() * 3), Math.floor(Math.random() * 3)],
            scale: [Math.floor(Math.random() * 1) + 1, Math.floor(Math.random() * 1) + 1],
            transition: {
                yoyo: true,
                duration: 5
            }
        },
    };


    useEffect(() => {
        const timer = setTimeout(() => {
            controls.start('to').then(() => {
                controls.start('idle');
            });
        }, 1000);
        return () => clearTimeout(timer);
    }, []);

    useEffect(() => {
        if (hasEnteredProjects) {
            controls.start('from');
        }
        else if (inMainViewport) {
            controls.start('to').then(() => {
                controls.start('idle');
            });
        }
    }, [inMainViewport, hasEnteredProjects]);

    // TODO overlapping items
    // const isOverlapping = () => {
    //     const skillCirlcles = document.querySelectorAll('.skill-circle');
    //     const backgroundCard = document.querySelector('.profile-card');

    //     if( skillCirlcles.top > backgroundCard. ||
    //         skillCirlcles.right < backgroundCard.left ||
    //         skillCirlcles.bottom < backgroundCard.top ||
    //         skillCirlcles.left > backgroundCard.right)

    // };

    return (
        <motion.div
            drag
            dragSnapToOrigin
            dragElastic={1}
            variants={skillCircleVariants}
            onDragEnd={() => controls.start('idle')}
            initial='from'
            animate={controls}
            style={{ background: color }}
            className="skill-circle bkg">
            {body}
        </motion.div>
    );
};

export default SkillCircle;