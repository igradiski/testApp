import React, { useState, useEffect } from 'react';
import {
  BrowserRouter as Router,
  Switch,
  useLocation
} from "react-router-dom";
import ReactDOM from 'react-dom';
import './App.css';
import { Table, Tag, Input, Button, Space, Form, Checkbox } from 'antd';
import Highlighter from 'react-highlight-words';
import { SearchOutlined } from '@ant-design/icons';
import axios from 'axios';
import 'antd/dist/antd.css';

import ProtectedRoute from './routes/protectedRoutes';

import prijavaFrom from './components/PrijavaForm/prijavaForm'

import FilterCustom from "./FilterCustom"



const App = () => {
  <Router  basename="/app">
    <Switch>
    <ProtectedRoute
            isAuthenticated={true}
            path="/secret"
            component={prijavaFrom}
          />
    </Switch>
  </Router>
}
export default App;
