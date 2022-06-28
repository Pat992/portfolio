import { motion, useAnimation, Variants } from 'framer-motion';
import '../styles.scss';
import InsightsSvg from './Insights';
import PublicSvg from './Public';
import phone from '../../../assets/adwave/adwave-phone.png';
import est from '../../../assets/adwave/adwave-est.png';
import app from '../../../assets/adwave/adwave-app.png';
import AdwaveSvg from './AdwaveSvg';
import { useEffect, useState } from 'react';
import DescriptionCard from '../Description-card';
import FlutterSvg from '../../UI/SVGs/FlutterSvg';
import AdmobSvg from '../../UI/SVGs/AdmobSvg';
import GoogleCloudSvg from '../../UI/SVGs/GoogleCloudSvg';
import GooglePlaySvg from '../../UI/SVGs/GooglePlaySvg';

const projectVariants: Variants = {
    from: {
        opacity: 0,
        x: '100vw'
    },
    to: {
        opacity: 1,
        x: 0,
        transition: {
            duration: 0.5,
            type: 'easeInOut',
            when: 'beforeChildren',
            staggerChildren: 0.1,
        }
    }
};

const phoneVariants: Variants = {
    to: {
        x: '-80%',
        y: '0',
        scale: 1,
    },
    hover: {
        scale: 1.1,
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
    },
    hover: {
        x: '-80%',
        scale: 1.5,
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
    },
    hover: {
        y: '80%',
        scale: 1.5,
    }
};

interface AdWaveProps {
    startAnimation: boolean
};
const AdWave: React.FC<AdWaveProps> = ({ startAnimation }) => {
    const [hover, setHover] = useState(false);
    const controls = useAnimation();

    useEffect(() => {
        if (startAnimation) {
            controls.start('to');
        } else {
            controls.start('from');
        }
    }, [startAnimation]);

    useEffect(() => {
        if (hover) {
            controls.start('hover');
        } else {
            controls.start('to');
        }
    }, [hover]);

    return (
        <div className='adwave-project project'>
            <DescriptionCard
                title='AdWave'
                description='lorem safddsd sofhjsak hkjdsf kjshfdk sdhf kdshfkjshd fkjsdh fkjdshfkdshfkj dshk fjhdsk fj'
                technologies={[
                    <div><FlutterSvg /><p>Flutter</p></div>,
                    <div><AdmobSvg /><p>AdMob API</p></div>,
                    <div><GoogleCloudSvg /><p>Google Cloud</p></div>,
                ]}
                links={[
                    <a href="https://play.google.com/store/apps/details?id=htth.admob.android.AdWave" target='_blank'>
                        <GooglePlaySvg />
                        <p>Download</p>
                    </a>
                ]}
                isLeft={true}
            />
            <motion.div onHoverStart={() => setHover(true)} onHoverEnd={() => setHover(false)} className='project-card'>
                <div className='adwave-card o-hidden'>
                    <div className='title-row'>
                        <AdwaveSvg />
                        <h2>AdWave</h2>
                    </div>
                    <PublicSvg startAnimation={startAnimation} />
                    <motion.div className='project-image' variants={projectVariants} animate={controls} initial='from'>
                        <motion.img variants={phoneVariants} className='phone' src={phone} alt="phone" />
                        <motion.img variants={estVariants} className='est' src={est} alt="estimate" />
                        <motion.img variants={appVariants} className='app' src={app} alt="app" />
                    </motion.div>
                </div>
                <InsightsSvg startAnimation={startAnimation} />
            </motion.div>
        </div>
    );
};

export default AdWave;