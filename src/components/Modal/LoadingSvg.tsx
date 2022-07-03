import { useAnimation, Variants, motion } from "framer-motion";
import { useEffect } from "react";
import './styles.scss';

const svgVariants: Variants = {
    loading: {
        originX: '50%',
        originY: '50%',
        rotate: '365deg',
        transition: {
            ease: 'linear',
            repeatDelay: 0,
            duration: 2,
            delay: 0,
            type: 'tween',
            repeatType: 'loop',
            repeat: Infinity
        }
    },
    success: {
        rotate: '0deg'
    },
    error: {
        rotate: '0deg'
    },
}

const circleVariants: Variants = {
    loading: {

    },
    success: {},
    error: {},
}

const errorVariants: Variants = {
    loading: {
        opacity: 0,
        pathLength: 0,
    },
    success: {
        opacity: 0,
        pathLength: 0,
        transition: {
            duration: 0.5
        }
    },
    error: {
        opacity: 1,
        pathLength: 1,
        transition: {
            duration: 0.5
        }
    },
}

const successVariants: Variants = {
    loading: {
        opacity: 0,
        pathLength: 0,
    },
    success: {
        opacity: 1,
        pathLength: 1,
        transition: {
            duration: 0.5
        }
    },
    error: {
        opacity: 0,
        pathLength: 0,
        transition: {
            duration: 0.5
        }
    },
}

interface LoadingSvgProps {
    isError: boolean,
    isSuccess: boolean,
};
const LoadingSvg: React.FC<LoadingSvgProps> = ({ isError, isSuccess }) => {
    const controls = useAnimation();

    useEffect(() => {
        controls.start('loading');
    }, []);

    useEffect(() => {
        if (isSuccess) {
            controls.start('success');
        }
        else if (isError) {
            controls.start('error');
        }
    }, [isError, isSuccess]);

    return (
        <motion.svg variants={svgVariants} animate={controls} viewBox="0 0 200 201" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlnsXlink="http://www.w3.org/1999/xlink" xmlSpace="preserve" fillRule="evenodd" clipRule='evenodd' strokeLinecap="round" strokeLinejoin="round" strokeMiterlimit={1.5}>
            <g transform="matrix(1,0,0,1,-5849,-10)">
                <g id="loading" transform="matrix(0.104167,0,0,0.185185,5849,10.7829)">
                    <rect x="0" y="0" width="1920" height="1080" style={{ fill: 'none' }} />
                    <g transform="matrix(7.60717,-2.4705,4.392,4.27903,-44781.6,14763)">
                        <path className="main-color" d="M6049,110.783C6049,165.974 6004.19,210.783 5949,210.783C5893.81,210.783 5849,165.974 5849,110.783C5849,55.591 5893.81,10.783 5949,10.783C5985.52,10.783 6017.5,30.406 6034.95,59.675" style={{ fill: 'none', strokeWidth: '15px' }} />
                    </g>
                    <g transform="matrix(9.6,0,0,5.4,-56150.4,-58.2279)">
                        <motion.path className="main-color" variants={successVariants} d="M5878,118C5914.22,137.222 5926.66,166.665 5926.66,166.665C5926.66,166.665 5937.44,137.606 5967.99,92.829C5998.54,48.051 6024,24 6024,24" style={{ fill: 'none', strokeWidth: '15px' }} />
                    </g>
                    <g transform="matrix(9.6,0,0,-5.4,-56109.1,1175.58)">
                        <motion.path className="main-color" variants={errorVariants} d="M5893,66C5893,66 5908.45,88.452 5938.99,118.99C5966.65,146.653 5992.98,165.98 5992.98,165.98" style={{ fill: 'none', strokeWidth: '15px' }} />
                    </g>
                    <g transform="matrix(-9.6,0,0,-5.4,57996.3,1175.58)">
                        <motion.path className="main-color" variants={errorVariants} d="M5893,66C5893,66 5908.45,88.452 5938.99,118.99C5966.65,146.653 5992.98,165.98 5992.98,165.98" style={{ fill: 'none', strokeWidth: '15px' }} />
                    </g>
                </g>
            </g>
        </motion.svg>

    );
};

export default LoadingSvg;