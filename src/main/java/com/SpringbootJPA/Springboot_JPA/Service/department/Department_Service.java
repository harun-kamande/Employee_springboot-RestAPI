package com.SpringbootJPA.Springboot_JPA.Service.department;

import com.SpringbootJPA.Springboot_JPA.models.Department;

import java.util.List;

public interface Department_Service {
    List<Department> get_all_Departments();
    Department get_department_By_id();

    Department get_department_By_id(Long id);

    Department create_new_department(Department new_department);

}
