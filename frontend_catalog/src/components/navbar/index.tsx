import {ReactComponent as InstagramIcon } from "assets/img/instagram.svg";
import {ReactComponent as LogoIcon } from "assets/img/bia_logo.svg";
import "./style.css";

function Navbar() {
  return (
      <header>
      <nav className="container">
      <div className="catalog-nav-content">
        <div className="logo-group">
            <LogoIcon className="logo-icon"/>
            <h1>Bia Vaz crochê</h1>
        </div>
        <a href="https://www.instagram.com/biavazscroche/">
          <div className="catalog-contact-container">
          <InstagramIcon className="instagram-icon" />
          <p>/biavazscroche</p>
        </div>
        </a>
      </div>
    </nav>
  </header>
  );
}
export default Navbar;