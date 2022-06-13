import ProfileCard from './ProfileCard';
import './styles.scss';

interface MainProps { };
const Main: React.FC<MainProps> = () => {
    return (
        <section className='main'>
            <div className='introduction'>
                <h4>Patrick Hettich</h4>
                <h1>
                    <span>software developer \</span>
                    <br />
                    <span className='title-2'>cloud engineer</span>
                </h1>
            </div>
            <div className='profile'><ProfileCard /></div>
        </section>
    );
};

export default Main;