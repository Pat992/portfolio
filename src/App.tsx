import { useViewportScroll } from 'framer-motion';
import './App.scss';
import Main from './components/Main';
import Nav from './components/Navigation';
import Projects from './components/Projects';
import Skills from './components/Skills';
import ConnectionSidebar from './components/Sidebar/ConnectionSidebar';
import { useAppDispatch, useAppSelector } from './store/hooks';
import { setScrollValue } from './store/scroll-slice';

const App = () => {
  const { scrollYProgress } = useViewportScroll();
  const dispatch = useAppDispatch();
  const isDarkTheme = useAppSelector((state) => state.theme.isDarkTheme);

  scrollYProgress.onChange(() => {
    dispatch(setScrollValue(scrollYProgress.get()));
  });

  return (
    <div className={isDarkTheme ? 'dark' : 'light'}>
      <Nav />
      <Main />
      <Projects />
      <Skills />
      <ConnectionSidebar />
    </div>
  );
}

export default App;
