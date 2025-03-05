package com.SpringbootJPA.Springboot_JPA.Service.department;

import com.SpringbootJPA.Springboot_JPA.Repository.Department_Repository;
import com.SpringbootJPA.Springboot_JPA.models.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Department_Service_Implementation implements Department_Service {



    private final Department_Repository department_repo;


    @Autowired
    public Department_Service_Implementation(Department_Repository department_repo) {
        this.department_repo = department_repo;
    }


    @Override
    public List<Department> get_all_Departments() {
        System.out.println(department_repo.findAll());
        return department_repo.findAll();
    }

    @Override
    public Department get_department_By_id() {
        return null;
    }

    @Override
    public Department get_department_By_id(Long id) {
        Optional<Department> find_department=department_repo.findById(id);
        return find_department.orElse(null);
    }

    @Override
    public Department create_new_department(Department new_department) {
        return department_repo.save(new_department);
    }
}
