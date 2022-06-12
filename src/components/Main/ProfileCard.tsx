import './styles.scss';
import profile from '../../assets/image.png';

interface ProfileCardProps { };
const ProfileCard: React.FC<ProfileCardProps> = () => {
    return (
        <div className='profile-card'>
            <div className='profile-image-overlay'></div>
            <img className='profile-image' src={profile} alt="profile image" />
        </div>
    );
};

export default ProfileCard;