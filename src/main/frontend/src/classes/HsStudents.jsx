import { useState } from "react";
import {
  addHsStudent,
  getHsStudents,
  updateHsStudents,
  getHsStudentById
} from "../components/apiCalls.jsx";
import HsStudentsApplication from "./../features/HsStudentsApplication.jsx";

export default function AllHsStudents() {
  const [allHsStudents, setAllHsStudents] = useState([]);
  const [hsStudent, setHsStudent] = useState({});

  const handleEdit = async (hsStudent_id) => {
    const responseHsStudent = await getHsStudentById(hsStudent_id);
    setHsStudent(responseHsStudent);
  };
  const handleChangeFirstName = (event) => {
    setHsStudent((previousUserValue) => {
      return {
        ...previousUserValue,
        firstName: event.target.value,
      };
    });
  };
  /**
   * Handles change of last name
   * @param {Event} event
   */
  const handleChangeLastName = (event) => {
    setHsStudent((previousUserValue) => {
      return {
        ...previousUserValue,
        lastName: event.target.value,
      };
    });
  };
  const handleChangeEmail = (event) => {
    setHsStudent((previousUserValue) => {
      return {
        ...previousUserValue,
        email: event.target.value,
      };
    });
  };
  return (
    <div class="container">
      <h2>University Student Application</h2>
      <p>
        <input
          defaultValue={hsStudent.firstName}
          placeholder="Enter first name here."
          name="firstName"
          type="text"
          onChange={handleChangeFirstName}
        />
      </p>
      <p>
        <input
          defaultValue={hsStudent.lastName}
          placeholder="Enter last name here."
          name="lastName"
          type="text"
          onChange={handleChangeLastName}
        />
      </p>
      <p>
        <input
          defaultValue={hsStudent.email}
          placeholder="Enter email here."
          name="email"
          type="text"
          onChange={handleChangeEmail}
        />
      </p>
      <button
        onClick={async () => {
          await addHsStudent(hsStudent);
        }}
      >
        Add application
      </button>
      &nbsp;
      <button
        onClick={async () => {
          await updateHsStudents({ ...hsStudent });
        }}
      >
        Edit application
      </button>

      <h2>View current high school students applications:</h2>
      <HsStudentsApplication allHsStudents={allHsStudents} onEdit={handleEdit} />
      <button
        onClick={async () => {
          const response = await getHsStudents();
          console.log(response);
          setAllHsStudents(response);
        }}
      >
        Refresh
      </button>
    </div>
  );
}