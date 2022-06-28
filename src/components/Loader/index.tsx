import { Variants } from 'framer-motion';
import Icon from '../UI/IconSvg';
import './styles.scss';

const svgVariants: Variants = {
    from: {
        originY: '50%',
        originX: '50%',
        scale: 100,
    },
    to: {
        scale: 5,
        transition: {
            duration: 3,
            type: 'spring',
        }
    }
};

interface LoaderProps {
    onAnimationComepleteHandler: Function
};
const Loader: React.FC<LoaderProps> = ({ onAnimationComepleteHandler }) => {
    return (
        <div className="loader">
            <Icon animationVariants={svgVariants} onAnimationComepleteHandler={onAnimationComepleteHandler} />
        </div>
    );
};

export default Loader;