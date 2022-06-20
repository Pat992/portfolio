import { motion, Variants } from 'framer-motion';
import '../styles.scss';
import InsightsSvg from './Insights';
import PublicSvg from './Public';

interface AdWaveProps { };
const AdWave: React.FC<AdWaveProps> = () => {
    return (
        <div className='adwave-project project'>
            <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Quia iste quos, rem nihil obcaecati quisquam magnam neque? Aliquam, perferendis atque?</p>
            <div className='project-card'>
                <div className='adwave-card o-hidden'>
                    <h2>AdWave</h2>
                    <PublicSvg />
                </div>
                <InsightsSvg />
            </div>
        </div>
    );
};

export default AdWave;