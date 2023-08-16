
import { useState } from 'react';
import './App.css';
import './components/StudentApplicationType';
import './features/Hello.css';

function InternshipApplication() {


  const [formData, setFormData] = useState({
    firstname: '',
    lastname: '',
    occupation: ['default'],
    schoolname: '',
    study: '',
    email: '',
    phone: '',
    residence: '',
    technologies: ['']
  })

  const onChangeHandler = (event) => {

    console.log(event)
    if (event.target.name === 'technologies') {

      let copy = { ...formData }

      if (event.target.checked) {
        copy.technologies.push(event.target.value)
      } else {
        copy.technologies = copy.technologies.filter(el => el !== event.target.value)
      }

      setFormData(copy)

    } else {
      setFormData(() => ({
        ...formData,
        [event.target.name]: event.target.value
      }))
    }
  }

  const onSubmitHandler = (event) => {
    event.preventDefault()
    console.log(formData)
  }
  return (
    
    
    <div className="App">
    <div className="hello">
    <h1 className="title">OG CS Summer Internship Application</h1>
    <div className="description">Welcome to the summer internship application page. <small>Please fill out this required information, and we'll reach out to you soon!</small></div>
      </div>
      <form onSubmit={onSubmitHandler}>
        <div className="form-group">
          <label htmlFor="firstname" className="form-label">First name</label>
          <input placeholder="Your first name goes here." className="form-control" name="firstname" onChange={onChangeHandler} value={formData.firstname} />
        </div>
        <div className="form-group">
          <label htmlFor="lastname" className="form-label">Last name</label>
          <input placeholder="Your last name goes here." className="form-control" name="lastname" onChange={onChangeHandler} value={formData.lastname} />
        </div>
        <div className="form-group">
          <label htmlFor="occupation" className="form-label">Occupation</label>
          <select className="form-select" name="occupation" onChange={onChangeHandler} value={formData.occupation}>
            <option value="default">Choose your current occupation:</option>
            <option value="student">High school student</option>
            <option value="employee">University student</option>
            <option value="other">Other</option>
          </select>
        </div>
        <div className="form-group">
          <label htmlFor="dob" className="form-label">Date of birth</label>
          <input placeholder="DD/MM/YYYY" className="form-control" name="dob" onChange={onChangeHandler} value={formData.dob} />
        </div>
        <div className="form-group">
          <label htmlFor="schoolname" className="form-label">School name</label>
          <input placeholder="Your educational institution's name goes here." className="form-control" name="schoolname" onChange={onChangeHandler} value={formData.schoolname} />
        </div>
        <div className="form-group">
          <label htmlFor="study" className="form-label">Course of studies</label>
          <input placeholder="Insert the name of your study program." className="form-control" name="study" onChange={onChangeHandler} value={formData.study} />
        </div>
        <div className="form-group">
          <label htmlFor="email" className="form-label">E-mail</label>
          <input placeholder="eg. email@somewhere.com" className="form-control" name="email" onChange={onChangeHandler} value={formData.email} />
        </div>
        <div className="form-group">
          <label htmlFor="phone" className="form-label">Phone number</label>
          <input placeholder="eg. 091 234 5678" className="form-control" name="phone" onChange={onChangeHandler} value={formData.phone} />
        </div>
        <div className="form-group">
          <label htmlFor="residence" className="form-label">Current residence</label>
          <input placeholder="Please enter where you currently live." className="form-control" name="residence" onChange={onChangeHandler} value={formData.residence} />
        </div>
        <div className="form-group">
          <label htmlFor="technologies" className="form-label">Familiar technologies</label>
          <div>
            <div>
              <input type="checkbox" name="technologies" value="frontend" onChange={onChangeHandler} checked={formData.technologies.indexOf('frontend') !== -1} />
              <label htmlFor="frontend">Frontend</label>
            </div>
            <div>
              <input type="checkbox" name="technologies" value="backend" onChange={onChangeHandler} checked={formData.technologies.indexOf('backend') !== -1} />
              <label htmlFor="backend">Backend</label>
            </div>
            <div>
              <input type="checkbox" name="technologies" value="qa" onChange={onChangeHandler} checked={formData.technologies.indexOf('qa') !== -1} />
              <label htmlFor="qa">QA testing</label>
            </div>
          </div>
        </div>
        <div className="form-group">
          <button className="btn" type="submit" >Submit application</button>
        </div>
      </form>
    </div>
  );

}

export default InternshipApplication;
