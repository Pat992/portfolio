import { motion } from 'framer-motion';
import './styles.scss';
import profile from '../../assets/image.png';

const cardVariants = {
    from: {
        scale: 0,
        rotateZ: '-50deg'
    },
    to: {
        scale: 1,
        rotateZ: '15deg',
        transition: {
            delay: 2,
            duration: 0.5,
            when: 'beforeChildren',
            staggerChildren: 0.4
        }
    }
}

const imageVariants = {
    from: {
        y: '50vh',
        scale: 0.5
    },
    to: {
        y: 0,
        scale: 1,
        rotateZ: '-15deg',
        transition: {
            duration: 1,
            type: 'easeOut',
        }
    }
}

interface ProfileCardProps { };
const ProfileCard: React.FC<ProfileCardProps> = () => {
    return (
        <motion.div variants={cardVariants} initial='from' animate='to' className='profile-card'>
            <div className='profile-image-overlay'></div>
            <motion.img variants={imageVariants} className='profile-image' src={profile} alt="profile image" />
        </motion.div>
    );
};

export default ProfileCard;