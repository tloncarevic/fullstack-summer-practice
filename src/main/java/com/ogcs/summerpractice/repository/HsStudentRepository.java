package com.ogcs.summerpractice.repository;

import com.ogcs.summerpractice.model.HsStudent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HsStudentRepository extends JpaRepository<HsStudent, Long> {
}
