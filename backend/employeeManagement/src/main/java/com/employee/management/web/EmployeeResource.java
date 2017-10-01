package com.employee.management.web;


import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.employee.management.domain.Employee;

public interface EmployeeResource {


	Employee createEmployee(Employee Employee);
    List<Employee> getEmployees();
    Employee getEmployeeById(String id);
    Employee updateEmployee(@RequestBody Employee employee);
    void deleteEmployee(String id);
}
