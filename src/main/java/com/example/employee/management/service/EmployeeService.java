package com.example.employee.management.service;

import com.example.employee.management.dto.EmployeeRequest;
import com.example.employee.management.entity.Employee;
import com.example.employee.management.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public Employee create(EmployeeRequest request) {
        Employee employee = Employee.builder()
                .employeename(request.getEmployeeName())
                .department(request.getDepartment())
                .salary(request.getSalary())
                .build();
        return employeeRepository.save(employee);
    }

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public List<Employee> findByDepartment(String department) {
        return employeeRepository.findByDepartment(department);
    }

    public void delete(String id) {
        employeeRepository.deleteById(id);
    }
}

