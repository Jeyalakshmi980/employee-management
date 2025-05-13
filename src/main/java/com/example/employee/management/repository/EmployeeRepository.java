package com.example.employee.management.repository;

import com.example.employee.management.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
    List<Employee> findByDepartment(String department);
}

