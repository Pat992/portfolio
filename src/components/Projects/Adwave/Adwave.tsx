import { motion, Variants } from 'framer-motion';
import '../styles.scss';
import InsightsSvg from './Insights';
import PublicSvg from './Public';
import phone from '../../../assets/adwave/adwave-phone.png';
import est from '../../../assets/adwave/adwave-est.png';
import app from '../../../assets/adwave/adwave-app.png';
import AdwaveSvg from './AdwaveSvg';

interface AdWaveProps { };
const AdWave: React.FC<AdWaveProps> = () => {
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
                    <div className='project-image'>
                        <img className='phone' src={phone} alt="phone" />
                        <img className='est' src={est} alt="estimate" />
                        <img className='app' src={app} alt="app" />
                    </div>

                </div>
                <InsightsSvg />
            </div>
        </div>
    );
};

export default AdWave;