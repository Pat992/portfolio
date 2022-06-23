import { motion, Variants } from 'framer-motion';
import '../styles.scss';
import InsightsSvg from './Insights';
import PublicSvg from './Public';
import phone from '../../../assets/adwave/adwave-phone.png';
import est from '../../../assets/adwave/adwave-est.png';
import app from '../../../assets/adwave/adwave-app.png';

interface AdWaveProps { };
const AdWave: React.FC<AdWaveProps> = () => {
    return (
        <div className='adwave-project project'>
            <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Quia iste quos, rem nihil obcaecati quisquam magnam neque? Aliquam, perferendis atque?</p>
            <div className='project-card'>
                <div className='adwave-card o-hidden'>
                    <h2>AdWave</h2>
                    <PublicSvg />
                    <img className='project-image phone' src={phone} alt="phone" />
                    <img className='project-image est' src={est} alt="estimate" />
                    <img className='project-image app' src={app} alt="app" />
                </div>
                <InsightsSvg />
            </div>
        </div>
    );
};

export default AdWave;