
import { Route } from 'react-router-dom';
import { Switch } from 'react-router-dom';
import { BrowserRouter } from 'react-router-dom';
import './App.css';
import CheckList from './components/CheckList';
import Footer from './components/Footer';
import Header from './components/Header';
import Login from './components/Login';
import ServerError from './components/ServerError';
import Severity from './components/Severity';

function App() {
  return (
    <BrowserRouter>
    <div >
      <Header/>
      <Switch>
        <Route path="/login" component={Login}/>
        <Route path="/checklist" component={CheckList}/>
        <Route path="/severity" component={Severity}/>
        <Route path="/servererror" component={ServerError}/>
      </Switch>
      <Footer/>
    
    </div>
    </BrowserRouter>
  );
}

export default App;
