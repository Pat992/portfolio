import '../styles.scss';
import Background from './Bg';

interface AndFmProps { };
const AndFm: React.FC<AndFmProps> = () => {
    return (
        <div className='andfm-project project-reverse'>
            <div className='project-card o-hidden'>
                <h2>AndFM</h2>
                <Background />
            </div>
            <p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Saepe pariatur dolor sequi provident quis illum nulla recusandae similique labore fugit?</p>
        </div>
    );
};

export default AndFm;