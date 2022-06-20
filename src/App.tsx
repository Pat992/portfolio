import { useViewportScroll } from 'framer-motion';
import './App.scss';
import Main from './components/Main';
import Nav from './components/Navigation';
import Projects from './components/Projects';
import Skills from './components/Skills';
import ConnectionSidebar from './components/Sidebar/ConnectionSidebar';
import { useAppDispatch, useAppSelector } from './store/hooks';
import { setScrollValue } from './store/scroll-slice';
import Footer from './components/Footer/Footer';
import { Fragment, useEffect, useState } from 'react';

const App = () => {
  const [loaded, setLoaded] = useState(false);
  const { scrollYProgress } = useViewportScroll();
  const dispatch = useAppDispatch();
  const isDarkTheme = useAppSelector((state) => state.theme.isDarkTheme);

  useEffect(() => {
    const onPageLoad = () => {
      setTimeout(() => {
        setLoaded(true);
      }, 500);
    };

    // Check if the page has already loaded
    if (document.readyState === "complete") {
      onPageLoad();
    } else {
      window.addEventListener("load", onPageLoad);
      // Remove the event listener when component unmounts
      return () => window.removeEventListener("load", onPageLoad);
    }
  }, []);

  scrollYProgress.onChange(() => {
    dispatch(setScrollValue(scrollYProgress.get()));
  });

  return (
    <div className={isDarkTheme ? 'dark' : 'light'}>
      {!loaded ?
        <h1>loading now</h1>
        : <Fragment>
          <ConnectionSidebar />
          <Nav />
          <Main />
          <Projects />
          <Skills />
          <Footer />
        </Fragment>
      }
    </div>
  );
}

export default App;
