import { Fragment } from 'react';
import './App.scss';
import Main from './components/Main';
import Nav from './components/Navigation';
import Projects from './components/Projects';
import Skills from './components/Skills';

function App() {
  return (
    <Fragment>
      <Nav />
      <Main />
      <Projects />
      <Skills />
    </Fragment>
  );
}

export default App;
