package com.example.employee.management.controller;

import com.example.employee.management.dto.EmployeeRequest;
import com.example.employee.management.entity.Employee;
import com.example.employee.management.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping
    public Employee create(@RequestBody @Valid EmployeeRequest request) {
        return employeeService.create(request);
    }

    @GetMapping
    public List<Employee> getAll() {
        return employeeService.findAll();
    }

    @GetMapping("/department/{dept}")
    public List<Employee> byDepartment(@PathVariable String dept) {
        return employeeService.findByDepartment(dept);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        employeeService.delete(id);
    }
}

