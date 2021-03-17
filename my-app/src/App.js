import React from 'react';
import { BrowserRouter as Router, Switch, Route } from "react-router-dom";
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import NavBar from "./components/NavBar";
import About from "./pages/About";
import Contact from './pages/Contact';
import TaskManager from './pages/TaskManager';
import Footer from "./components/Footer";
import Login from "./pages/Login"

function App() {
  return (
    <Router>
      <NavBar />
      <div className="container">
        <Switch>
          {/* you can only match ONE route inside */}
          <Route exact path="/login" component={Login} />
          <Route exact path="/contact" component={Contact} />
          <Route exact path="/taskManager" component={TaskManager} />
          {/* take home for anything else */}
          <Route component={About} />
        </Switch>
      </div>
      <Footer>
      </Footer>
    </Router>
  );
}

export default App;
