import { motion } from 'framer-motion';
import './styles.scss';
import profile from '../../assets/image.png';
import { useState } from 'react';

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
    },
    idle: {
        scale: [1, 0.9],
        rotateZ: ['15deg', '16deg'],
        transition: {
            yoyo: Infinity,
            duration: 10
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
    },
    idle: {
        y: 0,
        scale: 1,
        rotateZ: '-15deg',
        transition: {
            yoyo: Infinity,
        }
    }
}

interface ProfileCardProps { };
const ProfileCard: React.FC<ProfileCardProps> = () => {
    const [cardIdle, setCardIdle] = useState(false);

    return (
        <motion.div variants={cardVariants} initial='from' animate={!cardIdle ? 'to' : 'idle'} className='profile-card'>
            <div className='profile-image-overlay'></div>
            <motion.img variants={imageVariants} onAnimationComplete={() => {
                setCardIdle(_ => true);
                console.log(cardIdle);
            }} className='profile-image' src={profile} alt="profile image" />
        </motion.div>
    );
};

export default ProfileCard;