package com.example.employee.management.dto;

import jakarta.validation.constraints.*;

import lombok.Data;

@Data
public class EmployeeRequest {
    @NotBlank
    private String name;

    @NotBlank
    private String department;

    @Min(3000)
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

