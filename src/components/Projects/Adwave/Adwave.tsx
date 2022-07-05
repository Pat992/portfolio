import { motion, useAnimation, Variants } from 'framer-motion';
import '../styles.scss';
import InsightsSvg from './Insights';
import PublicSvg from './Public';
import phone from '../../../assets/adwave/adwave-phone.png';
import est from '../../../assets/adwave/adwave-est.png';
import app from '../../../assets/adwave/adwave-app.png';
import AdwaveSvg from './AdwaveSvg';
import { useRef } from 'react';
import DescriptionCard from '../Description-card';
import FlutterSvg from '../../UI/SVGs/FlutterSvg';
import AdmobSvg from '../../UI/SVGs/AdmobSvg';
import GoogleCloudSvg from '../../UI/SVGs/GoogleCloudSvg';
import GooglePlaySvg from '../../UI/SVGs/GooglePlaySvg';
import AffinityDesignerSvg from '../../UI/SVGs/AffinityDesignerSvg';

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
    from: {
        x: '-80%',
        y: '0',
        scale: 1,
    },
    to: {},
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
    const cardRef = useRef(null);
    const controls = useAnimation();

    if (startAnimation) {
        controls.start('to');
    } else {
        controls.start('from');
    }

    return (
        <div className='adwave-project project'>
            <DescriptionCard
                title='AdWave'
                description='Android application to check AdMob earnings as the official mobile-app has been in early access for some time. '
                technologies={[
                    <div><FlutterSvg /><p>Flutter</p></div>,
                    <div><AdmobSvg /><p>AdMob API</p></div>,
                    <div><GoogleCloudSvg /><p>Google Cloud</p></div>,
                    <div><AffinityDesignerSvg /><p>Affinity Designer</p></div>,
                ]}
                links={[
                    <a href="https://play.google.com/store/apps/details?id=htth.admob.android.AdWave" target='_blank' rel="noreferrer">
                        <GooglePlaySvg />
                        <p>Download</p>
                    </a>
                ]}
                isLeft={true}
            />
            <motion.div ref={cardRef} className='project-card'>
                <div className='adwave-card o-hidden'>
                    <div className='title-row'>
                        <AdwaveSvg />
                        <h2>AdWave</h2>
                    </div>
                    <PublicSvg startAnimation={startAnimation} />
                    <motion.div className='project-image' variants={projectVariants} animate={controls} initial='from'>
                        <motion.img variants={phoneVariants} className='phone img-ignore' src={phone} alt="phone" />
                        <motion.img variants={estVariants} className='est img-ignore' src={est} alt="estimate" />
                        <motion.img variants={appVariants} className='app img-ignore' src={app} alt="app" />
                    </motion.div>
                </div>
                <InsightsSvg startAnimation={startAnimation} />
            </motion.div>
        </div>
    );
};

export default AdWave;