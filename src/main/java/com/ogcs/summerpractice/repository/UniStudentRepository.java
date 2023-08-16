package com.ogcs.summerpractice.repository;

import com.ogcs.summerpractice.model.UniStudent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniStudentRepository extends JpaRepository<UniStudent, Long> {
}