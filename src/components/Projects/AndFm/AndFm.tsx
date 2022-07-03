import { motion, useAnimation, Variants } from 'framer-motion';
import '../styles.scss';
import Background from './Bg';
import light from '../../../assets/andfm/andfm-light.png';
import dark from '../../../assets/andfm/andfm-dark.png';
import { useEffect } from 'react';
import DescriptionCard from '../Description-card';
import FlutterSvg from '../../UI/SVGs/FlutterSvg';
import GooglePlaySvg from '../../UI/SVGs/GooglePlaySvg';
import AffinityDesignerSvg from '../../UI/SVGs/AffinityDesignerSvg';

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
                    <div className='andfm-svg' />
                    <h2>andFM</h2>
                </div>
                <motion.div variants={projectVariants} initial='from' animate={controls} className='project-img'>
                    <motion.img variants={lightVariants} className='light img-ignore' src={light} alt="phone-light" />
                    <motion.img variants={darkVariants} className='dark img-ignore' src={dark} alt="phone-dark" />
                </motion.div>
                <Background />
            </div>
            <DescriptionCard
                title='andFM'
                description='Radio android app with more than 28000 Stations, including music, news, and podcasts in one App. Using the Radio Browser API'
                technologies={[
                    <div><FlutterSvg /><p>Flutter</p></div>,
                    <div><AffinityDesignerSvg /><p>Affinity Designer</p></div>,
                ]}
                links={[
                    <a href="https://play.google.com/store/apps/details?id=com.htth.and_fm" target='_blank'>
                        <GooglePlaySvg />
                        <p>Download</p>
                    </a>
                ]}
                isLeft={false}
            />
        </div>
    );
};

export default AndFm;