package com.SpringbootJPA.Springboot_JPA.Controllers;


import com.SpringbootJPA.Springboot_JPA.Repository.EmployeeRepository;
import com.SpringbootJPA.Springboot_JPA.Service.EmployeeService;
import com.SpringbootJPA.Springboot_JPA.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    public EmployeeService employee_Service;

    public EmployeeController(EmployeeService employee_Service) {
        this.employee_Service = employee_Service;
    }

    @GetMapping("/get_employees")
    public List<Employee> get_Employees(){
        return employee_Service.get_Employee();
    }

    @PostMapping("/post_employee")
    public Employee post_employee(@RequestBody Employee employee){
        return employee_Service.save_new_employee(employee);

    }

    @GetMapping("/get_single_employee/{id}")
    public Employee get_single_employee(@PathVariable Long id){
        return employee_Service.get_single_employee(id);
    }



}
