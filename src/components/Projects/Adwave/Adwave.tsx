import '../styles.scss';
import InsightsSvg from './Insights';
import PublicSvg from './Public';

interface AdWaveProps { };
const AdWave: React.FC<AdWaveProps> = () => {
    return (
        <div className='adwave-project project'>
            <div className='project-card adwave-card'>
                <h2>AdWave</h2>
                <PublicSvg />
            </div>
            <InsightsSvg />
        </div>
    );
};

export default AdWave;