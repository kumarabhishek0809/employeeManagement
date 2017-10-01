package com.employee.management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.management.domain.Employee;
import com.employee.management.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Autowired
    private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee save(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteAll() {
		employeeRepository.deleteAll();
		
	}

	@Override
	public void delete(String id) {
		employeeRepository.deleteById(id);
		
	}

	@Override
	public Employee updateEmployee(Employee employee) {
//		Optional<Employee> employeeFromDB = employeeRepository.findById(employee.getId());
//		if(employeeFromDB.isPresent()) {
//			Employee employeeDB = employeeFromDB.get();
//		}
		return employeeRepository.save(employee);
	}

    

}
