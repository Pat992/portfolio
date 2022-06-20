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
  const { scrollY } = useViewportScroll();
  const dispatch = useAppDispatch();
  const isDarkTheme = useAppSelector((state) => state.theme.isDarkTheme);

  scrollY.onChange(() => {
    dispatch(setScrollValue(scrollY.get()));
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
