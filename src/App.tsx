import { useViewportScroll } from 'framer-motion';
import { Fragment } from 'react';
import './App.scss';
import Main from './components/Main';
import Nav from './components/Navigation';
import Projects from './components/Projects';
import Skills from './components/Skills';
import ConnectionSidebar from './components/UI/Connection-sidebar';
import { useAppDispatch } from './store/hooks';
import { setScrollValue } from './store/scroll-slice';

const App = () => {
  const { scrollY } = useViewportScroll();
  const dispatch = useAppDispatch();

  scrollY.onChange(() => {
    dispatch(setScrollValue(scrollY.get()));
  });

  return (
    <Fragment>
      <Nav />
      <Main />
      <Projects />
      <Skills />
      <ConnectionSidebar />
    </Fragment>
  );
}

export default App;
