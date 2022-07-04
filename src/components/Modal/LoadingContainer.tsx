import { AnimatePresence, motion, Variants } from "framer-motion";
import { useEffect } from "react";
import { useAppDispatch } from "../../store/hooks";
import { setShowModal } from "../../store/modal-slice";
import LoadingSvg from "./LoadingSvg";
import './styles.scss';

let loadingParagraph: React.ReactNode = <p></p>;

interface LoadingContainerProps {
    isError: boolean,
    isSuccess: boolean,
    isLoading: boolean,
    retry: Function,
};
const LoadingContainer: React.FC<LoadingContainerProps> = ({ isError, isSuccess, isLoading, retry }) => {
    const dispatch = useAppDispatch();

    if (isLoading) {
        loadingParagraph = <p>{'Loading...'.split('').map((letter, index) => <motion.span style={{ whiteSpace: 'pre' }} key={`${index}-${letter}`} initial={{ y: 0 }} animate={{ y: 5, transition: { delay: index / 10, yoyo: Infinity } }}>{letter}</motion.span>)}</p>;
    }

    if (isError) {
        loadingParagraph = <p>{'Oh oh, error sending the message'.split('').map((letter, index) => <motion.span style={{ whiteSpace: 'pre' }} key={`${index}-${letter}`} initial={{ y: 5 }} animate={{ y: 0, transition: { delay: index / 50, duration: 0.1 } }}>{letter}</motion.span>)}</p>;
    }

    if (isSuccess) {
        loadingParagraph = <p>{'Message sent.'.split('').map((letter, index) => <motion.span style={{ whiteSpace: 'pre' }} key={`${index}-${letter}`} initial={{ y: 5 }} animate={{ y: 0, transition: { delay: index / 50, duration: 0.1 } }}>{letter}</motion.span>)}</p>;
    }

    return (
        <div className={isLoading ? 'loading-container' : 'loading-container hidden'}>
            <LoadingSvg isError={isError} isSuccess={isSuccess} isLoading={isLoading} />
            {loadingParagraph}
            {
                isSuccess &&
                <button type="button" onClick={() => dispatch(setShowModal(false))}>CLOSE</button>
            }
            {
                isError &&
                <div>
                    <button type="button" onClick={() => retry()}>RETRY</button>
                    <button className="cancel" type="button" onClick={() => dispatch(setShowModal(false))}>CANCEL</button>
                </div>
            }
        </div>
    );
};

export default LoadingContainer;