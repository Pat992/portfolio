import { useAnimation, motion, Variants } from 'framer-motion';
import { Fragment, useEffect, useState } from 'react';
import { useAppDispatch, useAppSelector } from '../../store/hooks';
import { setHasDoneIconAnim } from '../../store/main-slice';
import IconSvg from '../UI/IconSvg';
import Shape1D from '../../assets/shape-1-dark.png';
import Shape2D from '../../assets/shape-2-dark.png';
import Shape3D from '../../assets/shape-3-dark.png';
import Shape4D from '../../assets/shape-4-dark.png';
import Shape1L from '../../assets/shape-1-light.png';
import Shape2L from '../../assets/shape-2-light.png';
import Shape3L from '../../assets/shape-3-light.png';
import Shape4L from '../../assets/shape-4-light.png';
import './styles.scss';

const containerVariants: Variants = {
    from: {},
    to: {
        transition: {
            staggerChildren: 0.1,
            when: 'afterChildren'
        }
    },
    leaveMain: {
        transition: {
            staggerChildren: 0.1,
            when: 'beforeChildren'
        }
    }
};

const svgsVariantsOne: Variants = {
    from: {
        scale: 0,
    },
    to: {
        scale: 1,
        y: 0,
        transition: {
            duration: 1,
            type: 'easeInOut'
        }
    },
    leaveMain: {
        scale: 100,
        y: 200,
        transition: {
            duration: 5,
            type: 'easeInOut'
        }
    }
};

const svgsVariants: Variants = {
    from: {
        scale: 0,
    },
    to: {
        y: 0,
        scale: 1,
        opacity: 1,
        transition: {
            duration: 1,
            type: 'easeInOut'
        }
    },
    leaveMain: {
        y: 200,
        scale: 0,
    }
};

interface SvgShapesProps { };
const SvgShapes: React.FC<SvgShapesProps> = () => {
    const [hasDoneIcon, setHasDoneIcon] = useState(false);
    const [hasDoneSvg, setHasDoneSvg] = useState(false);
    const hasLoaded = useAppSelector((state) => state.doc.hasLoaded);
    const inMainViewport = useAppSelector((state) => state.main.inViewport);
    const hasEnteredProjects = useAppSelector((state) => state.projects.hasEnteredVP);
    const controls = useAnimation();
    const dispatch = useAppDispatch();
    const isDarkTheme = useAppSelector((state) => state.theme.isDarkTheme);

    useEffect(() => {
        if (hasDoneIcon && hasLoaded) {
            controls.start('to');
        }
    }, [hasLoaded, hasDoneIcon, controls]);

    useEffect(() => {
        if (hasDoneSvg) {
            dispatch(setHasDoneIconAnim());
        }
    }, [hasDoneSvg, dispatch]);

    useEffect(() => {
        if (hasDoneIcon) {
            if (hasEnteredProjects) {
                controls.start('leaveMain');
            }
            else if (inMainViewport) {
                controls.start('to');
            }
        }
    }, [inMainViewport, hasEnteredProjects, hasDoneIcon, controls]);

    return (
        <motion.div className='svg-container' variants={containerVariants} initial='from' animate={controls}>
            {isDarkTheme ?
                <Fragment>
                    <motion.img variants={svgsVariantsOne} className='shape-1 img-ignore' src={Shape1D} alt="" />
                    <motion.img variants={svgsVariants} className='shape-2 img-ignore' src={Shape2D} alt="" />
                    <motion.img variants={svgsVariants} className='shape-3 img-ignore' src={Shape3D} alt="" />
                    <motion.img variants={svgsVariants} className='shape-4 img-ignore' src={Shape4D} alt="" onAnimationComplete={() => setHasDoneSvg(true)} />
                </Fragment> :
                <Fragment>
                    <motion.img variants={svgsVariantsOne} className='shape-1 img-ignore' src={Shape1L} alt="" />
                    <motion.img variants={svgsVariants} className='shape-2 img-ignore' src={Shape2L} alt="" />
                    <motion.img variants={svgsVariants} className='shape-3 img-ignore' src={Shape3L} alt="" />
                    <motion.img variants={svgsVariants} className='shape-4 img-ignore' src={Shape4L} alt="" onAnimationComplete={() => setHasDoneSvg(true)} />
                </Fragment>

            }
            {/* {isDarkTheme ?
                <Fragment>
                    <motion.div variants={svgsVariantsOne} className='shape-1 dark-shape' />
                    <motion.div variants={svgsVariants} className='shape-2 dark-shape' />
                    <motion.div variants={svgsVariants} className='shape-3 dark-shape' />
                    <motion.div variants={svgsVariants} onAnimationComplete={() => setHasDoneSvg(true)} className='shape-4 dark-shape' />
                </Fragment> :
                <Fragment>
                    <motion.div variants={svgsVariantsOne} className='shape-1 light-shape' />
                    <motion.div variants={svgsVariants} className='shape-2 light-shape' />
                    <motion.div variants={svgsVariants} className='shape-3 light-shape' />
                    <motion.div variants={svgsVariants} onAnimationComplete={() => setHasDoneSvg(true)} className='shape-4 light-shape' />
                </Fragment>

            } */}
            <IconSvg onCompleteAnimation={() => setHasDoneIcon(true)} />
        </motion.div>
    );
};

export default SvgShapes;