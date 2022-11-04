import React from 'react'
import { useState } from 'react'

const FormUser = () => {


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
        method: 'POST',
        headers: {
            'Content-type': 'application/json'
        },
        body: JSON.stringify(data)
        }

        const url = "http://localhost:8081/reservations";
        fetch(url, requestOptions)
        .then(console.log("post"))
        .then(alert("Reservation Save"))
        .catch(error => console.log(error));
    
    
    };
    

    
    


  return (
   <form onSubmit={handleSubmit}>
    <input type="text" name="name" placeholder="Name" onChange={handleInputChange} value ={formValues.name || ''}/>
    <input type="text" name="nationality" placeholder="Nationality" onChange={handleInputChange} value={formValues.nationality || ''}/>
    <input type="number" name="identification" placeholder="Identification" onChange={handleInputChange} value={formValues.identification || ''}/>
    
    <div className='age'>
        <p>Age:</p>
        <input type="radio" value="1" name="age"/> Less than 2 years
        <input type="radio" value="2" name="age"/> Between 2-9
        <input type="radio" value="3" name="age"/> 9+
    </div>
    <input type="text" name="origin" placeholder='Origin' value={formValues.origin}/>
    <input type="text" name="destination" placeholder='Destination' value={formValues.destination}/>
    <select name="baggage" onChange={handleInputChange} value={formValues.baggage || ''}>
        <option value = {true}>With Baggage</option>
        <option value = {false}>With No Baggage</option>
    </select>
    <input type="number" name="price" placeholder='Price' value={formValues.price}/>
    <input type="date" name="dateformat" data-date="" data-date-format="DD MMMM YYYY" value={formValues.dateformat}/>
    <input type="text" name="airline" placeholder='Airline' value={formValues.airline}/>
    <select name="scales" onChange={handleInputChange} value={formValues.scales || ''}>
        <option value = {true} >With Scale</option>
        <option value = {false} >With No Scale</option>
    </select>
    <div>
        <button type="submit">Send</button>
        <button type="submit">Back</button>

   </div>
   </form>
  )
}

export default FormUser