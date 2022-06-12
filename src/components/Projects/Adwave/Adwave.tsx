import '../styles.scss';
import InsightsSvg from './Insights';
import PublicSvg from './Public';

interface AdWaveProps { };
const AdWave: React.FC<AdWaveProps> = () => {
    return (
        <div className='adwave-project project'>
            <div className='project-card adwave-card'>
                <PublicSvg />
            </div>
            <InsightsSvg />
        </div>
    );
};

export default AdWave;