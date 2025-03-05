package com.SpringbootJPA.Springboot_JPA.Repository;

import com.SpringbootJPA.Springboot_JPA.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Department_Repository extends JpaRepository<Department,Long> {

}

