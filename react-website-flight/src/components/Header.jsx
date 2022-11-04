import React from 'react';
import "./header.css";

const Header = () => {
  return (
    <header className='header'>
        <nav className="nav_container">
            <a href="index.html" className="nav__logo"></a>
            <div className='nav__menu'>
                <ul className='nav__list grid'>
                    <li className="nav__item">
                        <a href="day" className="nav__link">
                        <i className='bx bxs-calendar'>
                             Booking By Day
                            </i>
                        </a>
                        <a href="baggage" className="nav__link">
                        <i className='bx bx-shopping-bag'>
                             Booking By Baggage
                            </i>
                        </a>
                        <a href="scale" className="nav__link">
                         <i className='bx bxs-plane-land' >
                             Booking By Scale
                            </i>
                        </a>
                        <a href="airline" className="nav__link">
                        <i className='bx bxs-plane-alt' >
                             Booking By Airline
                            </i>
                        </a>
                    </li>
                </ul>
                </div>
        </nav>
    </header>
  )
}

export default Header