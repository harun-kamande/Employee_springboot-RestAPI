package com.SpringbootJPA.Springboot_JPA.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Department")
public class Department {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String departmentName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
