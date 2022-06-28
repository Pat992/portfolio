import { Variants } from 'framer-motion';
import IconSvg from '../UI/IconSvg';
import './styles.scss';

const svgVariants: Variants = {
    from: {
        originY: '50%',
        originX: '50%',
        scale: 100,
    },
    to: {
        scale: 1,
        transition: {
            duration: 3,
            type: 'easeInOut',
        }
    }
};

interface LoaderProps {
    onAnimationComepleteHandler: Function
};
const Loader: React.FC<LoaderProps> = ({ onAnimationComepleteHandler }) => {
    return (
        <div className="loader">
            <IconSvg animationVariants={svgVariants} onAnimationComepleteHandler={onAnimationComepleteHandler} />
        </div>
    );
};

export default Loader;