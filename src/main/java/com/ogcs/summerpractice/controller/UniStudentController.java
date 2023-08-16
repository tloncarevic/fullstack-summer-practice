package com.ogcs.summerpractice.controller;

import com.ogcs.summerpractice.model.UniStudent;
import com.ogcs.summerpractice.repository.UniStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/uni_students")
public class UniStudentController {
    private final UniStudentRepository uniStudentRepository;

    @Autowired
    public UniStudentController(UniStudentRepository uniStudentRepository) {
        this.uniStudentRepository = uniStudentRepository;
    }

    @GetMapping
    public List<UniStudent> getUniStudents() {
        System.out.println("[GET] /uniStudents");
        return (List<UniStudent>) uniStudentRepository.findAll();
    }

    @GetMapping("/{uniStudent_id}")
    public UniStudent getUniStudent(@PathVariable Long uniStudent_id) {
        System.out.println("[GET] /uni_students/" + uniStudent_id);
        return uniStudentRepository.findById(uniStudent_id).orElseThrow(RuntimeException::new);
    }

    @PostMapping
    public ResponseEntity createUniStudent(@RequestBody UniStudent uniStudent) throws URISyntaxException {
        System.out.println("[POST] /uni_students");
        UniStudent savedUniStudent = uniStudentRepository.save(uniStudent);
        return ResponseEntity.created(new URI("/uni_students/" + savedUniStudent.getUniStudent_id())).body(savedUniStudent);
    }

    @PutMapping("/{uniStudent_id}")
    public ResponseEntity updateUniStudent(@PathVariable Long uniStudent_id, @RequestBody UniStudent uniStudent) {
        System.out.println("[PUT] /uni_students");
        UniStudent currentUniStudent = uniStudentRepository.findById(uniStudent_id).orElseThrow(RuntimeException::new);
        currentUniStudent.setUniStudentFirstName(uniStudent.getUniStudentFirstName());
        currentUniStudent.setUniStudentLastName(uniStudent.getUniStudentLastName());
        currentUniStudent.setUniStudentDateOfBirth(uniStudent.getUniStudentDateOfBirth());
        currentUniStudent.setUniStudentUniName(uniStudent.getUniStudentUniName());
        currentUniStudent.setUniStudentCourseStudy(uniStudent.getUniStudentCourseStudy());
        currentUniStudent.setUniStudentPhoneNumber(uniStudent.getUniStudentPhoneNumber());
        currentUniStudent.setUniStudentEmail(uniStudent.getUniStudentEmail());
        currentUniStudent.setUniStudentResidence(uniStudent.getUniStudentResidence());
        currentUniStudent.setUniStudentTechnologies(uniStudent.getUniStudentTechnologies());
        // CV
        return ResponseEntity.ok(currentUniStudent);
    }

    @DeleteMapping("/{uniStudent_id}")
    public ResponseEntity deleteUniStudent(@PathVariable Long uniStudent_id) {
        System.out.println("[DELETE] /uni_students/" + uniStudent_id);
        uniStudentRepository.deleteById(uniStudent_id);
        return ResponseEntity.ok().build();
    }

}
