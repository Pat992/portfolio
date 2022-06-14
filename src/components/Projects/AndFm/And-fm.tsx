import '../styles.scss';
import Background from './Bg';

interface AndFmProps { };
const AndFm: React.FC<AndFmProps> = () => {
    return (
        <div className='andfm-project'>
            <div className='project-card'>
                <h2>AndFM</h2>
                <Background />
            </div>
        </div>
    );
};

export default AndFm;