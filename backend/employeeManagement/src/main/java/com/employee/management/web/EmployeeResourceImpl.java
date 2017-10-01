package com.employee.management.web;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.employee.management.domain.Employee;
import com.employee.management.service.EmployeeService;

@RestController
@RequestMapping("/api/employeeManagement")
@CrossOrigin(origins = "http://localhost:6070", maxAge = 3600)
public class EmployeeResourceImpl implements EmployeeResource {

    @Autowired
    private EmployeeService employeeService;


	@RequestMapping(value = "/all" , method = RequestMethod.GET,produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
	@Override
	public List<Employee> getEmployees() {
		return employeeService.findAll();
	}
	
	@ResponseStatus(value = HttpStatus.OK)
	@RequestMapping(value = "/createEmployee", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@Override
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.save(employee);
	}

	@ResponseStatus(value = HttpStatus.OK)
	@RequestMapping(value = "/updateEmployee", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@Override
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
	
	@RequestMapping(value = "select/{id}" , method = RequestMethod.GET,produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
	@Override
	public Employee getEmployeeById(@PathVariable("id") String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping(value = "delete/{id}" , method = RequestMethod.GET,produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
	@Override
	public void deleteEmployee( @PathVariable("id") String id) {
		employeeService.delete(id);
	}


}
