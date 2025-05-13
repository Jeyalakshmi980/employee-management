package com.example.employee.management.dto;

import jakarta.validation.constraints.*;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class EmployeeRequest {
    @Id
    private String id;
    @NotBlank
    private String employeename;

    @NotBlank
    private String department;

    @Min(3000)
    private double salary;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getEmployeeName() {
        return employeename;
    }
}
