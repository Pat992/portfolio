import { Variants, motion } from 'framer-motion';

const pathVariants: Variants = {
    from: {
        pathLength: 0,
    },
    to: {
        pathLength: 1,
        transition: { duration: 2, ease: 'easeInOut' }
    }
}

interface MailSvgProps { };
const MailSvg: React.FC<MailSvgProps> = () => {
    return (
        <motion.svg xmlns="http://www.w3.org/2000/svg" height="60%" viewBox="0 0 24 24" width="60%" fill='none'>
            {/* <motion.path variants={pathVariants} d="M0 0h24v24H0z" fill="none" /> */}
            <motion.path className="svg-fill" initial='from' animate='to' variants={pathVariants} d="M20 4H4c-1.1 0-1.99.9-1.99 2L2 18c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zm0 14H4V8l8 5 8-5v10zm-8-7L4 6h16l-8 5z" />
        </motion.svg>
    );
};

export default MailSvg;