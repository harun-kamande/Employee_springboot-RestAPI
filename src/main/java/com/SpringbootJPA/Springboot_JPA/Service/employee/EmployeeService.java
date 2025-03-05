package com.SpringbootJPA.Springboot_JPA.Service.employee;

import com.SpringbootJPA.Springboot_JPA.models.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> get_Employee();
    Employee save_new_employee();

    Employee save_new_employee(Employee employee);
    Employee get_single_employee(Long id);
    List<Employee> delete_employee(Long id);
}
