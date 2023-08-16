package com.ogcs.summerpractice.controller;

import com.ogcs.summerpractice.model.HsStudent;
import com.ogcs.summerpractice.repository.HsStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/hs_students")
public class HsStudentController {

    private final HsStudentRepository hsStudentRepository;

    @Autowired
    public HsStudentController(HsStudentRepository hsStudentRepository) {
        this.hsStudentRepository = hsStudentRepository;
    }

    @GetMapping
    public List<HsStudent> getHsStudents() {
        System.out.println("[GET /hsStudents");
        return (List<HsStudent>) hsStudentRepository.findAll();
    }

    @GetMapping("/{hsStudent_id")
    public HsStudent getHsStudent(@PathVariable Long hsStudent_id) {
        System.out.println("[GET] /hs_students/" + hsStudent_id);
        return hsStudentRepository.findById(hsStudent_id).orElseThrow(RuntimeException::new);
    }

    @PostMapping
    public ResponseEntity createHsStudent(@RequestBody HsStudent hsStudent) throws URISyntaxException {
        System.out.println("[POST] /hs_students");
        HsStudent savedHsStudent = hsStudentRepository.save(hsStudent);
        return ResponseEntity.created(new URI("/hs_students/" + savedHsStudent.getHsStudent_id())).body(savedHsStudent);
    }

    @PutMapping("/{hsStudent_id")
    public ResponseEntity updateUniStudent(@PathVariable Long hsStudent_id, @RequestBody HsStudent hsStudent) {
        System.out.println("[PUT] /hs_students");
        HsStudent currentHsStudent = hsStudentRepository.findById(hsStudent_id).orElseThrow(RuntimeException::new);
        currentHsStudent.setHsStudentFirstName(hsStudent.getHsStudentFirstName());
        currentHsStudent.setHsStudentLastName(hsStudent.getHsStudentLastName());
        currentHsStudent.setHsStudentDateOfBirth(hsStudent.getHsStudentDateOfBirth());
        currentHsStudent.setHsStudentSchoolName(hsStudent.getHsStudentSchoolName());
        currentHsStudent.setHsStudentCourseStudy(hsStudent.getHsStudentCourseStudy());
        currentHsStudent.setHsStudentPhoneNumber(hsStudent.getHsStudentPhoneNumber());
        currentHsStudent.setHsStudentEmail(hsStudent.getHsStudentEmail());
        currentHsStudent.setHsStudentResidence(hsStudent.getHsStudentResidence());
        currentHsStudent.setHsStudentTechnologies(hsStudent.getHsStudentTechnologies());
        // CV
        return ResponseEntity.ok(currentHsStudent);
    }

    @DeleteMapping("/{hsStudent_id}")
    public ResponseEntity deleteUniStudent(@PathVariable Long hsStudent_id) {
        System.out.println("[DELETE] /hs_students/" + hsStudent_id);
        hsStudentRepository.deleteById(hsStudent_id);
        return ResponseEntity.ok().build();
    }

}
