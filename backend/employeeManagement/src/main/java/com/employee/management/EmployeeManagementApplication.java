package com.employee.management;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.employee.management.domain.Employee;
import com.employee.management.service.EmployeeService;

@SpringBootApplication
public class EmployeeManagementApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}
	
	@Bean
    public CommandLineRunner init(EmployeeService employeeService) {

        return args -> {

        	employeeService.deleteAll();
        	
        	Employee employee1 = employeeService.save(new Employee("Employee 1","Employee1@gmail.com","11111111111","N"));
        	Employee employee2 = employeeService.save(new Employee("Employee 2","Employee2@gmail.com","222222222","N"));

        	

    		System.out.println("-------------------------------");
    		for (Employee employee : employeeService.findAll()) {
    			System.out.println(employee);
    		}
    		System.out.println();

        };

    }
}
