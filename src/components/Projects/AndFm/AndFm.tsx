import { motion, useAnimation, Variants } from 'framer-motion';
import '../styles.scss';
import Background from './Bg';
import light from '../../../assets/andfm/andfm-light.png';
import dark from '../../../assets/andfm/andfm-dark.png';
import AndFmSvg from './AndFmSvg';
import { useEffect } from 'react';
import DescriptionCard from '../Description-card';
import FlutterSvg from '../../UI/SkillCircles/FlutterSvg';

const projectVariants: Variants = {
    from: {
        opacity: 0,
        y: '100vw'
    },
    to: {
        opacity: 1,
        y: 0,
        transition: {
            duration: 0.5,
            type: 'easeInOut',
            when: 'beforeChildren'
        }
    },
    idle: {
        // TODO: idle anim
    }
};

const lightVariants: Variants = {
    from: {
        translateX: '0%',
        translateY: '0%',
        rotate: '0deg',
    },
    to: {
        translateX: '-60%',
        translateY: '5%',
        rotate: '-10deg',
    },
    idle: {
        // TODO: idle anim
    }
};

// transform: translate(15%, 0) rotate(15deg);
const darkVariants: Variants = {
    from: {
        translateX: '0%',
        rotate: '0deg',
    },
    to: {
        translateX: '15%',
        rotate: '15deg',
    },
    idle: {
        // TODO: idle anim
    }
};

interface AndFmProps {
    startAnimation: boolean
};
const AndFm: React.FC<AndFmProps> = ({ startAnimation }) => {
    const controls = useAnimation();

    useEffect(() => {
        if (startAnimation) {
            controls.start('to');
        } else {
            controls.start('from');
        }
    }, [startAnimation]);

    return (
        <div className='andfm-project project-reverse'>
            <div className='project-card o-hidden andfm-card'>
                <div className='title-row'>
                    <AndFmSvg />
                    <h2>andFM</h2>
                </div>
                <motion.div variants={projectVariants} initial='from' animate={controls} className='project-img'>
                    <motion.img variants={lightVariants} className='light' src={light} alt="phone-light" />
                    <motion.img variants={darkVariants} className='dark' src={dark} alt="phone-dark" />
                </motion.div>
                <Background />
            </div>
            <DescriptionCard
                title='AdWave'
                description='lorem safddsd sofhjsak hkjdsf kjshfdk sdhf kdshfkjshd fkjsdh fkjdshfkdshfkj dshk fjhdsk fj'
                technologies={[
                    <div><FlutterSvg /><p>Flutter</p></div>,
                ]}
                links={[]}
                isLeft={false}
            />
        </div>
    );
};

export default AndFm;