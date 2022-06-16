import { motion, Variants } from 'framer-motion';
import './styles.scss';

const svgVariants: Variants = {
    from: {
        y: 'calc(50vh + 100px)',
        x: '50vw',
        scale: 5
    },
    to: {
        y: 0,
        x: 0,
        scale: 1,
        transition: {
            duration: 0.5,
            type: 'easeInOut'
        }
    }
};


interface IconProps { };
const Icon: React.FC<IconProps> = () => {

    return (
        <motion.svg variants={svgVariants} initial='from' animate='to' className="icon" viewBox="0 0 200 200" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlSpace="preserve">
            <g transform="matrix(1,0,0,1,-5087,-549)">
                <g id="icon" transform="matrix(0.104167,0,0,0.185185,5087,549)">
                    <rect x="0" y="0" width="1920" height="1080" style={{ fill: 'none' }} />
                    <g transform="matrix(9.6,0,0,5.4,-48873.6,-2951.1)">
                        <path d="M5187,570.95C5187,569.322 5185.68,568 5184.05,568C5153.11,568 5128,593.115 5128,624.05L5128,722.05C5128,723.678 5129.32,725 5130.95,725C5161.89,725 5187,699.885 5187,668.95L5187,570.95Z" className='logo' />
                    </g>
                    <g transform="matrix(9.6,0,0,-3.26752,-48230.4,2485.05)">
                        <path d="M5187,660.63C5187,609.506 5161.89,568 5130.95,568C5129.32,568 5128,570.185 5128,572.875L5128,632.37C5128,683.494 5153.11,725 5184.05,725C5185.68,725 5187,722.815 5187,720.125L5187,660.63Z" className='logo' />
                    </g>
                </g>
            </g>
        </motion.svg>
    );
};

export default Icon;