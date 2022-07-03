import { useAppSelector } from '../../store/hooks';
import IconSvg from '../UI/IconSvg';
import './styles.scss';
interface SvgShapesProps { };
const SvgShapes: React.FC<SvgShapesProps> = () => {
    const isDarkTheme = useAppSelector((state) => state.theme.isDarkTheme);

    return (
        <div className='svg-container'>
            <div className={`shape-1 ${isDarkTheme ? 'dark-shape' : 'light-shape'}`} />
            <div className={`shape-2 ${isDarkTheme ? 'dark-shape' : 'light-shape'}`} />
            <div className={`shape-3 ${isDarkTheme ? 'dark-shape' : 'light-shape'}`} />
            <div className={`shape-4 ${isDarkTheme ? 'dark-shape' : 'light-shape'}`} />
            <IconSvg animationVariants={{}} onAnimationComepleteHandler={() => { }} />
        </div>
    );
};

export default SvgShapes;