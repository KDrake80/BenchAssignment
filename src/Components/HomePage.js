import React from 'react'

function HomePage() {
  return (
    <div><h1>Home Page</h1>
    <form> Log-In
        <div className='accountName'>
            <label className='email'>Email Address: </label>
            <input type='text'></input>
        </div>
    </form>

    </div>
  )
}

export default HomePage