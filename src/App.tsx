import { Fragment } from 'react';
import './App.scss';
import Main from './components/Main';
import Nav from './components/Navigation';
import Projects from './components/Projects';
import Skills from './components/Skills';
import ConnectionSidebar from './components/UI/Connection-sidebar';
import ContactButton from './components/UI/Contact-button';

const App = () => {
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
