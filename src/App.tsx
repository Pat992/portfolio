import { useViewportScroll } from 'framer-motion';
import { Fragment, useState } from 'react';
import { useDispatch } from 'react-redux';
import './App.scss';
import Main from './components/Main';
import Nav from './components/Navigation';
import Projects from './components/Projects';
import Skills from './components/Skills';
import ConnectionSidebar from './components/UI/Connection-sidebar';
import ContactButton from './components/UI/Contact-button';
import { setScrollValue } from './store/scroll-slice';

const App = () => {
  const { scrollY } = useViewportScroll();
  const dispatch = useDispatch();

  scrollY.onChange(() => {
    dispatch(setScrollValue(scrollY.get()));
  });

  return (
    <Fragment>
      <Nav />
      <Main />
      <Projects />
      <Skills />
      <ContactButton />
      <ConnectionSidebar />
    </Fragment>
  );
}

export default App;
