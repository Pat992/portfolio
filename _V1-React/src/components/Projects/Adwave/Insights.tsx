import { motion, useAnimation, Variants } from 'framer-motion';
import '../styles.scss';

// rotateZ(-10deg) translate(-20%, 25%)
const svgVariants: Variants = {
    from: {
        translateY: '100%',
        translateX: '-20%',
        scale: 0
    },
    to: {
        scale: 1,
        translateY: '25%',
        translateX: '-20%',
        transition: {
            duration: 1,
        }
    },
    idle: {
        // TODO: add idle
    }
};

interface InsightsSvgProps {
    startAnimation: boolean
};
const InsightsSvg: React.FC<InsightsSvgProps> = ({ startAnimation }) => {
    const controls = useAnimation();

    if (startAnimation) {
        controls.start('to');
    } else {
        controls.start('from');
    }

    return (
        <motion.svg variants={svgVariants} initial='from' animate={controls} className='insights' xmlns="http://www.w3.org/2000/svg" enable-background="new 0 0 24 24" viewBox="0 0 24 24" fill="#000000">
            <g>
                <rect fill="none" height="24" width="24" />
            </g>
            <g>
                <g>
                    <path d="M21,8c-1.45,0-2.26,1.44-1.93,2.51l-3.55,3.56c-0.3-0.09-0.74-0.09-1.04,0l-2.55-2.55C12.27,10.45,11.46,9,10,9 c-1.45,0-2.27,1.44-1.93,2.52l-4.56,4.55C2.44,15.74,1,16.55,1,18c0,1.1,0.9,2,2,2c1.45,0,2.26-1.44,1.93-2.51l4.55-4.56 c0.3,0.09,0.74,0.09,1.04,0l2.55,2.55C12.73,16.55,13.54,18,15,18c1.45,0,2.27-1.44,1.93-2.52l3.56-3.55 C21.56,12.26,23,11.45,23,10C23,8.9,22.1,8,21,8z" />
                </g>
            </g>
        </motion.svg>
    );
};

export default InsightsSvg;