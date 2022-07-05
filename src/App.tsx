import { useViewportScroll } from 'framer-motion';
import './App.scss';
import Main from './components/Main';
import Nav from './components/Navigation';
import Projects from './components/Projects';
import Skills from './components/Skills';
import ConnectionSidebar from './components/Sidebar/ConnectionSidebar';
import { useAppDispatch, useAppSelector } from './store/hooks';
import { setHasLoaded, setMousePosition, setScrollRawValue, setScrollValue } from './store/document-slice';
import Footer from './components/Footer';
import { Fragment, useEffect } from 'react';
import Modal from './components/Modal/Modal';

const App = () => {
  const { scrollYProgress, scrollY } = useViewportScroll();
  const dispatch = useAppDispatch();
  const isDarkTheme = useAppSelector((state) => state.theme.isDarkTheme);
  const isLoaded = useAppSelector((state) => state.doc.hasLoaded);
  const isCompleteAnim = useAppSelector((state) => state.main.hasDoneIconAnim);

  useEffect(() => {
    const onPageLoad = () => {
      dispatch(setHasLoaded());
    };

    // Check if the page has already loaded
    if (document.readyState === "complete") {
      onPageLoad();
    } else {
      window.addEventListener("load", onPageLoad);
      // Remove the event listener when component unmounts
      return () => window.removeEventListener("load", onPageLoad);
    }
  });

  useEffect(() => {
    window.addEventListener("mousemove", (e) => dispatch(setMousePosition({ x: e.clientX, y: e.clientY })));

    return () => {
      window.removeEventListener("mousemove", (e) => dispatch(setMousePosition({ x: 0, y: 0 })));
    };
  });

  scrollYProgress.onChange(() => {
    dispatch(setScrollValue(scrollYProgress.get()));
    dispatch(setScrollRawValue(scrollY.get()));
  });

  return (
    <div className={isDarkTheme ? 'dark' : 'light'}>
      <Fragment>
        <Nav />
        <Main />
        {isLoaded && isCompleteAnim &&
          <Fragment>
            <Modal />
            <ConnectionSidebar />
            <Projects />
            <Skills />
            <Footer />
          </Fragment>
        }
      </Fragment>
    </div>
  );
}

export default App;
