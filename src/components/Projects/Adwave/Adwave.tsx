import { motion, useAnimation, Variants } from 'framer-motion';
import '../styles.scss';
import InsightsSvg from './Insights';
import PublicSvg from './Public';
import phone from '../../../assets/adwave/adwave-phone.png';
import est from '../../../assets/adwave/adwave-est.png';
import app from '../../../assets/adwave/adwave-app.png';
import AdwaveSvg from './AdwaveSvg';
import { useEffect } from 'react';

const projectVariants: Variants = {
    from: {
        opacity: 0,
        x: '100vw'
    },
    to: {
        opacity: 1,
        x: 0,
        transition: {
            duration: 1,
            type: 'easeInOut',
            when: 'beforeChildren',
        }
    }
};

const estVariants: Variants = {
    from: {
        x: '-95%',
        y: '140%',
        scale: 1,
    },
    to: {
        x: '-90%',
        y: '130%',
        scale: 1.3,
        transition: {
            type: 'easeInOut',
            mass: 0.4,
            damping: 8,
        }
    }
};

const appVariants: Variants = {
    from: {
        x: '-140%',
        y: '110%',
        scale: 1,
    },
    to: {
        x: '-120%',
        y: '100%',
        scale: 1.3,
        transition: {
            type: 'easeInOut',
            mass: 0.3,
            damping: 8,
        }
    }
};

interface AdWaveProps {
    startAnimation: boolean
};
const AdWave: React.FC<AdWaveProps> = ({ startAnimation }) => {
    const controls = useAnimation();

    useEffect(() => {
        if (startAnimation) {
            controls.start('to');
        } else {
            controls.start('from');
        }
    }, [startAnimation]);

    return (
        <div className='adwave-project project'>
            <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Quia iste quos, rem nihil obcaecati quisquam magnam neque? Aliquam, perferendis atque?</p>
            <div className='project-card'>
                <div className='adwave-card o-hidden'>
                    <div className='title-row'>
                        <AdwaveSvg />
                        <h2>AdWave</h2>
                    </div>
                    <PublicSvg />
                    <motion.div className='project-image' variants={projectVariants} animate={controls} initial='from'>
                        <img className='phone' src={phone} alt="phone" />
                        <motion.img variants={estVariants} className='est' src={est} alt="estimate" />
                        <motion.img variants={appVariants} className='app' src={app} alt="app" />
                    </motion.div>

                </div>
                <InsightsSvg />
            </div>
        </div>
    );
};

export default AdWave;