package com.SpringbootJPA.Springboot_JPA.Service.employee;

import com.SpringbootJPA.Springboot_JPA.Repository.EmployeeRepository;
import com.SpringbootJPA.Springboot_JPA.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;


    @Service
    public class EmployeeServiceEmplementation implements EmployeeService {

        @Autowired
        private EmployeeRepository employeeRepo;

        public EmployeeServiceEmplementation(EmployeeRepository employeeRepo) {
            this.employeeRepo = employeeRepo;
        }

        @Override

        public List<Employee> get_Employee() {
            return employeeRepo.findAll();

        }

        @Override
        public Employee save_new_employee() {
            return null;
        }


        @Override
        public Employee save_new_employee(Employee employee) {
            return employeeRepo.save(employee);
        }

        @Override
        public Employee get_single_employee(Long id) {
            Optional<Employee> get_employee=employeeRepo.findById(id);
            if(get_employee.isPresent()){
                return get_employee.get();
            }else{
                return null;
            }

        }

        @Override
        public List<Employee> delete_employee(Long id) {
            Optional<Employee> find_employee=employeeRepo.findById(id);
            if(find_employee.isPresent()){
                employeeRepo.deleteById(id);

            }
            else{
                return null;
            }
            return employeeRepo.findAll();
        }
    }
