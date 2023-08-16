import axios from "axios";
import { URL, PORT } from "./constants";


// University Students API calls ----------------------------------------------------------------

export const getUniStudents = async () => {
    try {
      const res = await axios.get(URL + ":" + PORT + "/uni_students");
      return res.data;
    } catch (err) {
      console.log(err);
      return err;
    }
  };
  
  export const addUniStudent = async (uniStudent) => {
    try {
      const res = await axios.post(URL + ":" + PORT + "/uni_students", uniStudent);
      return res.data;
    } catch (err) {
      console.log(err);
      return { error: err };
    }
  };
  
  export const updateUniStudents = async (uniStudent) => {
    try {
      const res = await axios.put(
        URL + ":" + PORT + "/uni_students/" + uniStudent.uniStudent_id, uniStudent
      );
      return res.data;
    } catch (err) {
      return {
        error: err,
      };
    }
  };
  export const deleteUniStudent = async (uniStudent_id) => {
    try {
      const res = await axios.delete(
        URL + ":" + PORT + "/uni_students/" + uniStudent_id
      );
      return res.data;
    } catch (err) {
      return { error: err };
    }
  };
  export const getUniStudentById = async (uniStudent_id) => {
    try {
      const res = await axios.get(URL + ":" + PORT + "/uni_students/" + uniStudent_id);
      return res.data
    } catch (err) {
      return {error: err.message}
    }
  };
  

// High School Students API calls ----------------------------------------------------------------

export const getHsStudents = async () => {
  try {
    const res = await axios.get(URL + ":" + PORT + "/hs_students");
    return res.data;
  } catch (err) {
    console.log(err);
    return err;
  }
};

export const addHsStudent = async (hsStudent) => {
  try {
    const res = await axios.post(URL + ":" + PORT + "/hs_students", hsStudent);
    return res.data;
  } catch (err) {
    console.log(err);
    return { error: err };
  }
};

export const updateHsStudents = async (hsStudent) => {
  try {
    const res = await axios.put(
      URL + ":" + PORT + "/hs_students/" + hsStudent.hsStudent_id, hsStudent
    );
    return res.data;
  } catch (err) {
    return {
      error: err,
    };
  }
};
export const deleteHsStudent = async (hsStudent_id) => {
  try {
    const res = await axios.delete(
      URL + ":" + PORT + "/hs_students/" + hsStudent_id
    );
    return res.data;
  } catch (err) {
    return { error: err };
  }
};
export const getHsStudentById = async (hsStudent_id) => {
  try {
    const res = await axios.get(URL + ":" + PORT + "/hs_students/" + hsStudent_id);
    return res.data
  } catch (err) {
    return {error: err.message}
  }
};
