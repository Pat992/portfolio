import { motion, useAnimation, Variants } from 'framer-motion';
import './styles.scss';
import profile from '../../assets/image.png';
import { useEffect } from 'react';
import { useAppSelector } from '../../store/hooks';

const cardVariants: Variants = {
    from: {
        scale: 0,
        rotateZ: '-50deg'
    },
    to: {
        scale: 1,
        y: 0,
        rotateZ: '15deg',
        transition: {
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
    },
    moveToProjects: {
        scale: 10,
        y: 500,
        rotateZ: '10deg',
        transition: {
            duration: 1
        }
    }
}

const imageVariants: Variants = {
    from: {
        y: '50vh',
        scale: 0.5,
        rotateZ: '-15deg',
    },
    to: {
        y: 0,
        scale: 1,
        opacity: 1,
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
            //duration: 10
        }
    },
    moveToProjects: {
        opacity: 0,
        size: 0
    }
}

interface ProfileCardProps { };
const ProfileCard: React.FC<ProfileCardProps> = () => {
    const inMainViewport = useAppSelector((state) => state.main.inViewport);
    const hasEnteredProjects = useAppSelector((state) => state.projects.hasEnteredVP);
    const controls = useAnimation();

    useEffect(() => {
        const timer = setTimeout(() => {
            controls.start('to').then(() => {
                controls.start('idle');
            });
        }, 2000);
        return () => clearTimeout(timer);
    }, []);

    useEffect(() => {
        if (hasEnteredProjects === true) {
            controls.start('moveToProjects');
        }
        else if (inMainViewport === true) {
            controls.start('to').then(() => {
                controls.start('idle');
            });
        }
    }, [inMainViewport, hasEnteredProjects]);

    return (
        <motion.div variants={cardVariants} initial='from' animate={controls} className='profile-card'>
            <div className='profile-image-overlay'></div>
            <motion.img variants={imageVariants} className='profile-image' src={profile} alt="profile image" />
        </motion.div>
    );
};

export default ProfileCard;