import { useState } from "react";
import {
  addUniStudent,
  getUniStudents,
  updateUniStudents,
  getUniStudentById
} from "../components/apiCalls.jsx";
import UniStudentsApplication from "./../features/UniStudentsApplication.jsx";

export default function AllUniStudents() {
  const [allUniStudents, setAllUniStudents] = useState([]);
  const [uniStudent, setUniStudent] = useState({});

  const handleEdit = async (uniStudent_id) => {
    const responseUniStudent = await getUniStudentById(uniStudent_id);
    setUniStudent(responseUniStudent);
  };
  const handleChangeFirstName = (event) => {
    setUniStudent((previousUserValue) => {
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
    setUniStudent((previousUserValue) => {
      return {
        ...previousUserValue,
        lastName: event.target.value,
      };
    });
  };
  const handleChangeEmail = (event) => {
    setUniStudent((previousUserValue) => {
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
          defaultValue={uniStudent.firstName}
          placeholder="Enter first name here."
          name="firstName"
          type="text"
          onChange={handleChangeFirstName}
        />
      </p>
      <p>
        <input
          defaultValue={uniStudent.lastName}
          placeholder="Enter last name here."
          name="lastName"
          type="text"
          onChange={handleChangeLastName}
        />
      </p>
      <p>
        <input
          defaultValue={uniStudent.email}
          placeholder="Enter email here."
          name="email"
          type="text"
          onChange={handleChangeEmail}
        />
      </p>
      <button
        onClick={async () => {
          await addUniStudent(uniStudent);
        }}
      >
        Add application
      </button>
      &nbsp;
      <button
        onClick={async () => {
          await updateUniStudents({ ...uniStudent });
        }}
      >
        Edit application
      </button>

      <h2>View current university students applications:</h2>
      <UniStudentsApplication allUniStudents={allUniStudents} onEdit={handleEdit} />
      <button
        onClick={async () => {
          const response = await getUniStudents();
          console.log(response);
          setAllUniStudents(response);
        }}
      >
        Refresh
      </button>
    </div>
  );
}