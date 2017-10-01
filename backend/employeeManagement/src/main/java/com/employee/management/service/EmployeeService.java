package com.employee.management.service;

import java.util.List;

import com.employee.management.domain.Employee;

public interface EmployeeService {

	List<Employee> findAll();

	Employee save(Employee employee);

	void deleteAll();

	void delete(String id);

	Employee updateEmployee(Employee employee);

}
