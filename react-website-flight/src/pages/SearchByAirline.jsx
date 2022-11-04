import React from 'react'
import { useState } from 'react';

const SearchByAirline = () => {
    const[formValues, setFormValues] = useState({});

    const handleInputChange = (e) => {
        
        const { name, value } = e.target;
        console.log("handle", name, value);
        setFormValues({...formValues, [name]: value});
    }

    const handleSubmit = (e) => {
        e.preventDefault();
       
        const formData = new FormData(e.target);
        
        const data = Object.fromEntries(formData)
        
        const requestOptions = {
        method: 'GET',
        headers: {
            'Content-type': 'application/json'
        },
        body: JSON.stringify(data)
        }

        const url = "http://localhost:8080/flights";
        fetch(url, requestOptions)
        .then(console.log("get"))
        .catch(error => console.log(error));
    
    
    };
  return (
    <>
    <input type="text" name="name" placeholder="Airline" onChange={handleInputChange} value ={formValues.name || ''}/>
    <button type="submit">Search</button>

    
    </>
  )
}

export default SearchByAirline