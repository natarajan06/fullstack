import React from "react";
import { Link } from "react-router-dom"; // Import Link from react-router-dom

import CustomNavBar from './customnavbar';
import Slide from './Slide';


const Home = () => {
  return (
    <>
      <div>
        <CustomNavBar />
        <Slide />
      </div>

      <div style={{ flexDirection: 'row', display: 'flex' }}>
        <img className="t" src="https://hindgopay.com/images/pgc/recharge.png" style={{ width: 500, height: 500 }} />
        <div style={{ marginLeft: 50 }}>
          <br />
          <br />
          <br />
          <h1 className="ft">Recharge from anywhere in the world. Anytime.</h1>
          <br />
          <br />
          <p className="rt">Your online mobile recharge transaction is completely guaranteed and secure</p>
          <p className="rt">Earn reward points & get bonuses anytime, anywhere</p>
          <br />
          <br />
          <div style={{ flexDirection: 'row', display: 'flex' }}>
            <button className="innovation-button">
              Get started
            </button>
            <div style={{ marginLeft: 30 }}>
              {/* Link the "Learn more" button to the About page */}
              <Link to="/about">
                <button className="innovation-button">
                  Learn more
                </button>
              </Link>
            </div>
          </div>
          <br />
          <br />
          <div className="footer-icons">
            {/* Add more icons as needed */}
          </div>
          <p>&copy; 2024 Recharge Portal</p>
        </div>
      </div>
    </>
  );
};

export default Home;
