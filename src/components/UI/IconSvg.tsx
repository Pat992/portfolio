import { motion, useAnimation, Variants } from 'framer-motion';
import { useAppSelector } from '../../store/hooks';
import './styles.scss';

const iconVariants: Variants = {
    from: {
        originY: '50%',
        originX: '50%',
        scale: 100,
    },
    to: {
        y: 0,
        scale: 1,
        top: '35%',
        left: '20%',
        width: '25%',
        height: '25%',
        transition: {
            duration: 1.5
        }
    },
    leaveMain: {
        y: 200,
        scale: 0,
    }
}

interface IconSvgProps {
    onCompleteAnimation: Function
};
const IconSvg: React.FC<IconSvgProps> = ({ onCompleteAnimation }) => {
    const inMainViewport = useAppSelector((state) => state.main.inViewport);
    const hasEnteredProjects = useAppSelector((state) => state.projects.hasEnteredVP);
    const controls = useAnimation();

    if (hasEnteredProjects) {
        controls.start('leaveMain');
    }
    else if (inMainViewport) {
        controls.start('to');
    }

    return (
        <motion.svg variants={iconVariants} onAnimationComplete={() => onCompleteAnimation()} initial='from' animate={controls} className="IconSvg" viewBox="0 0 200 200" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlSpace="preserve">
            <g transform="matrix(1,0,0,1,-5087,-1162)">
                <g id="icon" transform="matrix(0.104167,0,0,0.185185,5087,1162.68)">
                    <rect x="0" y="0" width="1920" height="1080" style={{ fill: 'none' }} />
                    <g>
                        <g transform="matrix(9.6,-0,-0,5.4,-1.74623e-11,-3.66417)">
                            <use xlinkHref="#_Image1" x="20.464" y="13.714" width="85px" height="182px" />
                        </g>
                        <g transform="matrix(9.6,0,0,5.4,-48873.6,-2951.1)">
                            <path d="M5187,570.95C5187,569.322 5185.68,568 5184.05,568C5153.11,568 5128,593.115 5128,624.05L5128,722.05C5128,723.678 5129.32,725 5130.95,725C5161.89,725 5187,699.885 5187,668.95L5187,570.95Z" className='logo' />
                        </g>
                    </g>
                    <g>
                        <g transform="matrix(9.6,-0,-0,5.4,-1.74623e-11,-3.66417)">
                            <use xlinkHref="#_Image2" x="87.464" y="13.714" width="85px" height="120px" />
                        </g>
                        <g transform="matrix(9.6,0,0,-3.26752,-48230.4,2485.05)">
                            <path d="M5187,660.63C5187,609.506 5161.89,568 5130.95,568C5129.32,568 5128,570.185 5128,572.875L5128,632.37C5128,683.494 5153.11,725 5184.05,725C5185.68,725 5187,722.815 5187,720.125L5187,660.63Z" className='logo' />
                        </g>
                    </g>
                </g>
            </g>
            <defs>
                <image id="_Image1" width="85px" height="182px" xlinkHref="data:image/png;base64,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" />
                <image id="_Image2" width="85px" height="120px" xlinkHref="data:image/png;base64,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" />
            </defs>
        </motion.svg>
    );
};

export default IconSvg;