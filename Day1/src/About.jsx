import React from 'react';
import './About.css'
const AboutPage = () => {
  return (
    <div className="about-page">
      <h1>About Mobile Recharge</h1>
      <p>
        Welcome to our mobile recharge application! We aim to provide a convenient and reliable platform for you to recharge your mobile phone anytime, anywhere.
      </p>
      <h2>Our Mission</h2>
      <p>
        Our mission is to simplify the process of mobile recharge and make it accessible to everyone. Whether you're at home, at work, or on the go, you can easily top up your mobile phone with just a few clicks.
      </p>
      <h2>Features</h2>
      <ul>
        <li>Fast and secure transactions</li>
        <li>Support for all major mobile operators</li>
        <li>Flexible payment options</li>
        <li>24/7 customer support</li>
      </ul>
      <h2>Contact Us</h2>
      <p>
        If you have any questions or feedback, feel free to reach out to us at support@mobilerecharge.com. We're here to help!
      </p>
    </div>
  );
}

export default AboutPage;