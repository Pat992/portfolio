import { Fragment } from 'react';
import './App.scss';
import Main from './components/Main';
import Nav from './components/Navigation';
import Projects from './components/Projects';
import Skills from './components/Skills';
import ConnectionSidebar from './components/UI/Connection-sidebar';
import Github from './components/UI/Github';
import Linkedin from './components/UI/Linkedin';

function App() {
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
