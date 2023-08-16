package com.ogcs.summerpractice.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "hsStudents")
public class HsStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "hsstudent_id")
    private Long hsStudent_id;
    @Column(name = "hsstudent_firstname")
    private String hsStudentFirstName;

    @Column(name = "hsstudent_lastname")
    private String hsStudentLastName;

    @Column(name = "hsstudent_dob")
    private Date hsStudentDateOfBirth;

    @Column(name = "hsstudent_schoolname")
    private String hsStudentSchoolName;

    @Column(name = "hsstudent_coursestudy")
    private String hsStudentCourseStudy;

    @Column(name = "hsstudent_phonenumber")
    private String hsStudentPhoneNumber;

    @Column(name = "hsstudent_email")
    private String hsStudentEmail;

    @Column(name = "hsstudent_residence")
    private String hsStudentResidence;

    @Column(name = "hsstudent_technologies")
    private String hsStudentTechnologies;


    // HsStudent class - Getters and setters


    public Long getHsStudent_id() {
        return hsStudent_id;
    }

    public void setHsStudent_id(Long hsStudent_id) {
        this.hsStudent_id = hsStudent_id;
    }

    public String getHsStudentFirstName() {
        return hsStudentFirstName;
    }

    public void setHsStudentFirstName(String hsStudentFirstName) {
        this.hsStudentFirstName = hsStudentFirstName;
    }

    public String getHsStudentLastName() {
        return hsStudentLastName;
    }

    public void setHsStudentLastName(String hsStudentLastName) {
        this.hsStudentLastName = hsStudentLastName;
    }

    public Date getHsStudentDateOfBirth() {
        return hsStudentDateOfBirth;
    }

    public void setHsStudentDateOfBirth(Date hsStudentDateOfBirth) {
        this.hsStudentDateOfBirth = hsStudentDateOfBirth;
    }

    public String getHsStudentSchoolName() {
        return hsStudentSchoolName;
    }

    public void setHsStudentSchoolName(String hsStudentSchoolName) {
        this.hsStudentSchoolName = hsStudentSchoolName;
    }

    public String getHsStudentCourseStudy() {
        return hsStudentCourseStudy;
    }

    public void setHsStudentCourseStudy(String hsStudentCourseStudy) {
        this.hsStudentCourseStudy = hsStudentCourseStudy;
    }

    public String getHsStudentPhoneNumber() {
        return hsStudentPhoneNumber;
    }

    public void setHsStudentPhoneNumber(String hsStudentPhoneNumber) {
        this.hsStudentPhoneNumber = hsStudentPhoneNumber;
    }

    public String getHsStudentEmail() {
        return hsStudentEmail;
    }

    public void setHsStudentEmail(String hsStudentEmail) {
        this.hsStudentEmail = hsStudentEmail;
    }

    public String getHsStudentResidence() {
        return hsStudentResidence;
    }

    public void setHsStudentResidence(String hsStudentResidence) {
        this.hsStudentResidence = hsStudentResidence;
    }

    public String getHsStudentTechnologies() {
        return hsStudentTechnologies;
    }

    public void setHsStudentTechnologies(String hsStudentTechnologies) {
        this.hsStudentTechnologies = hsStudentTechnologies;
    }
}
