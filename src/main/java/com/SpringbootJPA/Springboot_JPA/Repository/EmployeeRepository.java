package com.SpringbootJPA.Springboot_JPA.Repository;

import com.SpringbootJPA.Springboot_JPA.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
