package com.ogcs.summerpractice.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "uniStudents")
public class UniStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "unistudent_id")
    private Long uniStudent_id;
    @Column(name = "unistudent_firstname")
    private String uniStudentFirstName;

    @Column(name = "unistudent_lastname")
    private String uniStudentLastName;

    @Column(name = "unistudent_dob")
    private Date uniStudentDateOfBirth;

    @Column(name = "unistudent_uniname")
    private String uniStudentUniName;

    @Column(name = "unistudent_coursestudy")
    private String uniStudentCourseStudy;

    @Column(name = "unistudent_phonenumber")
    private String uniStudentPhoneNumber;

    @Column(name = "unistudent_email")
    private String uniStudentEmail;

    @Column(name = "unistudent_residence")
    private String uniStudentResidence;

    @Column(name = "unistudent_technologies")
    private String uniStudentTechnologies;


    // UniStudent class - Getters and setters


    public Long getUniStudent_id() {
        return uniStudent_id;
    }

    public void setUniStudent_id(Long uniStudent_id) {
        this.uniStudent_id = uniStudent_id;
    }

    public String getUniStudentFirstName() {
        return uniStudentFirstName;
    }

    public void setUniStudentFirstName(String uniStudentFirstName) {
        this.uniStudentFirstName = uniStudentFirstName;
    }

    public String getUniStudentLastName() {
        return uniStudentLastName;
    }

    public void setUniStudentLastName(String uniStudentLastName) {
        this.uniStudentLastName = uniStudentLastName;
    }

    public Date getUniStudentDateOfBirth() {
        return uniStudentDateOfBirth;
    }

    public void setUniStudentDateOfBirth(Date uniStudentDateOfBirth) {
        this.uniStudentDateOfBirth = uniStudentDateOfBirth;
    }

    public String getUniStudentUniName() {
        return uniStudentUniName;
    }

    public void setUniStudentUniName(String uniStudentUniName) {
        this.uniStudentUniName = uniStudentUniName;
    }

    public String getUniStudentCourseStudy() {
        return uniStudentCourseStudy;
    }

    public void setUniStudentCourseStudy(String uniStudentCourseStudy) {
        this.uniStudentCourseStudy = uniStudentCourseStudy;
    }

    public String getUniStudentPhoneNumber() {
        return uniStudentPhoneNumber;
    }

    public void setUniStudentPhoneNumber(String uniStudentPhoneNumber) {
        this.uniStudentPhoneNumber = uniStudentPhoneNumber;
    }

    public String getUniStudentEmail() {
        return uniStudentEmail;
    }

    public void setUniStudentEmail(String uniStudentEmail) {
        this.uniStudentEmail = uniStudentEmail;
    }

    public String getUniStudentResidence() {
        return uniStudentResidence;
    }

    public void setUniStudentResidence(String uniStudentResidence) {
        this.uniStudentResidence = uniStudentResidence;
    }

    public String getUniStudentTechnologies() {
        return uniStudentTechnologies;
    }

    public void setUniStudentTechnologies(String uniStudentTechnologies) {
        this.uniStudentTechnologies = uniStudentTechnologies;
    }
}


