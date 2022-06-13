import '../styles.scss';
import Background from './Bg';

interface AndFmProps { };
const AndFm: React.FC<AndFmProps> = () => {
    return (
        <div className='andfm-project project'>
            <div className='project-card'>
                <Background />
            </div>
        </div>
    );
};

export default AndFm;