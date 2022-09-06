import React from 'react'
import {Link} from 'react-router-dom'
import HomePage from './HomePage'
import App from "C:/Users/kevin/OneDrive/Desktop/Full-Stack Assignments/pc-front/src/App.js"
function NavBar() {
  return (
    <div className='NavBar'>
        <div className='btn'>
            <Link to="/">Home</Link> <br />
            <Link to="/accounts">Accounts</Link>
        </ div>
    </div>
  )
}

export default NavBar