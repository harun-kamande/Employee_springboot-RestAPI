package com.SpringbootJPA.Springboot_JPA.Controllers;

import com.SpringbootJPA.Springboot_JPA.Service.department.Department_Service_Implementation;
import com.SpringbootJPA.Springboot_JPA.models.Department;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    private final Department_Service_Implementation department;

    public DepartmentController(Department_Service_Implementation department) {
        this.department = department;
    }

    @GetMapping("/get_Department")
    public List<Department> get_all(){
        return department.get_all_Departments();
    }

    @GetMapping("/get_Department/{id}")
    public Department get_by_id(@PathVariable Long id){
        return department.get_department_By_id(id);
    }

    @PostMapping("/create_department")
    public List<Department> create_department(@RequestBody Department my_department){
        department.create_new_department(my_department);
        return department.get_all_Departments();
    }
}
