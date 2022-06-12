import ProfileCard from './ProfileCard';
import './styles.scss';

interface MainProps { };
const Main: React.FC<MainProps> = () => {
    return (
        <section>
            <div className='introduction'>
                <h1>Patrick<br />Hettich</h1>
                <h4>software developer /<br />cloud engineer</h4>
            </div>
            <div className='animations'><ProfileCard /></div>
        </section>
    );
};

export default Main;