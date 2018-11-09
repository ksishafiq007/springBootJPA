package com.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.entity.StudentEntity;


public interface StudentRepo extends JpaRepository<StudentEntity, Long>{

}
