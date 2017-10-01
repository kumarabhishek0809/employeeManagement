package com.employee.management.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.employee.management.domain.Employee;

public interface EmployeeRepository extends MongoRepository<Employee,String> , EmployeeRepositoryCustom {
	public Employee findByName(String name);
}
