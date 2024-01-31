import React from 'react';
import { Link } from "react-router-dom";
import './Login.css'
const Login = ({ isAdmin }) => {
  return (
    <div className="container">
      <div className="form" id="login">
        <h1 className="form__title">{isAdmin ? 'Admin Login' : 'User Login'}</h1>
        <div className="form__input-group">
          <input
            type="text"
            className="form__input"
            autoFocus
            placeholder="Phone Number"
            id="usernameinput"
          />
        </div>
        <div className="form__input-group">
          <input
            type="password"
            className="form__input"
            autoFocus
            placeholder="Password"
            id="passwordInput"
          />
          <div className="padding"></div>
          <a href="#">
            <button className="form__button" id="loginButton">
              {isAdmin ? 'ADMIN LOGIN' : 'USER LOGIN'}
            </button>
          </a>
          <br></br>
          <br></br>
          <div style={{ paddingLeft: "8em" }}>
            <p>New User?/<Link to={isAdmin ? '/admin/signup' : '/signup'}>{isAdmin ? 'Admin Sign Up' : 'User Sign Up'}</Link></p>
          </div>
        </div>
      </div>
    </div>
  );
};

export default Login;
