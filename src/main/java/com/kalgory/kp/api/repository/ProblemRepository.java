package com.kalgory.kp.api.repository;

import com.kalgory.kp.api.entity.problem.Problem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Spring Data JPA 와 DI 를 활용하기 위한 문제 repository interface.
 */
public interface ProblemRepository extends JpaRepository<Problem, Long>,
    JpaSpecificationExecutor<Problem> {

}