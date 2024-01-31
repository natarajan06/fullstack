
// import './NavBar.css'; // Import your CSS file for styles
import { Link } from 'react-router-dom';
// import { FaHome, FaInfo, FaCog, FaEnvelope, FaSignOutAlt } from 'react-icons/fa'; // Import icons
import './NavigationBar.css'
const CustomNavBar = () => {
  return (
    <nav className="main-navigation">
      <ul className="nav-list">
        <li className="nav-item">
          <a href="#" className="nav-link">
            Home
          </a>
        </li>
        <li className="nav-item">
          <a href="/Plan" className="nav-link">
            Plans
          </a>
        </li>
        <li className="nav-item">
          <a href="/addon" className="nav-link">
           Addon
          </a>
        </li>
        <li className="nav-item">
          <a href="#" className="nav-link">
            Recharge
          </a>
        </li>
        <li className="nav-item nav-item-right">
          <a  className="nav-link" style={{marginLeft:820}}>
            <Link to='/'>Logout</Link>
          </a>
        </li>
      </ul>
    </nav>
  );
}

export default CustomNavBar;