import {useState} from 'react';
import './signup.css';
import { Link} from 'react-router-dom';

const Register = () => {
    // const [loginData, setLoginData] = useState({ username: '', password: '' });
    const [signupData, setSignupData] = useState({ newUsername: '', newPassword: '' });

    const handleSignup = () => {
        // Implement signup logic
        alert('Signup functionality to be implemented.');
      };

      return (
        <div className='l'>
          
        <div className="App">
          {/* <h1 className='fib'>welcome To WEBPIX </h1> */}
          <div className="container">
            <form id="loginForm">
              <h2 className='lo'>Register</h2>
              <label htmlFor="username">Username</label>
              <br/>
              
              <input className='mn'
                type="text"
                id="Username"
                name="Username"
                value={signupData.Username}
                onChange={(e) => setSignupData({ ...signupData, Username: e.target.value })}
                placeholder='Enter your Username'
                required
              />
               <br></br>
              <br></br>
              <label htmlFor="username">Mobile Number</label>
              <br/>
              
              <input className='mn'
                type="text"
                id="mobilenumber"
                name="mobilenumber"
                value={signupData.mobilenumber}
                onChange={(e) => setSignupData({ ...signupData, mobilenumber: e.target.value })}
                placeholder='Enter your mobile number'
                required
              />
              <br></br>
              <br></br>
    
              <label htmlFor="password">Password</label>
              <br/>
              
              <input
              className='ps'
                type="password"
                id="password"
                name="password"
                value={signupData.password}
                onChange={(e) => setSignupData({ ...signupData, password: e.target.value })}
                required
                placeholder='Enter your password'
              />
              <br></br>
              <br></br>
              {/* <label htmlFor="username">Username</label> */}
              <br/>
              
              {/* <select className='mn'
                type="text"
                id="Simname"
                name="Simname"
                value={signupData.Simname}
                onChange={(e) => setSignupData({ ...signupData, Simname: e.target.value })}
                required
                placeholder='Enter your Simname'
               ><option value="someOption">none</option>
                <option value="someOption">JIO</option>
               <option value="otherOption">AIRTEL</option>
               <option value="otherOption">VI</option>
               <option value="otherOption">BSNL</option>

               </select>

               <br></br> */}
          <br></br>

          <button className='bt' type="button" onClick={handleSignup} >
            <Link to='/login'>Register</Link>
          </button>
          <br></br>
          <h3 className='dt'>Already have an account?<Link to='/login'>Login</Link></h3>
         
        </form>

        </div>
    </div>
    </div>
    
  );
};

export default Register