import '../styles.scss';
import Background from './Bg';
import light from '../../../assets/andfm/andfm-light.png';
import dark from '../../../assets/andfm/andfm-dark.png';
import AndFmSvg from './AndFmSvg';

interface AndFmProps { };
const AndFm: React.FC<AndFmProps> = () => {
    return (
        <div className='andfm-project project-reverse'>
            <div className='project-card o-hidden'>
                <div className='title-row'>
                    <AndFmSvg />
                    <h2>andFM</h2>
                </div>
                <div className='project-img'>
                    <img className='light' src={light} alt="phone-light" />
                    <img className='dark' src={dark} alt="phone-dark" />
                </div>
                <Background />
            </div>
            <p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Saepe pariatur dolor sequi provident quis illum nulla recusandae similique labore fugit?</p>
        </div>
    );
};

export default AndFm;