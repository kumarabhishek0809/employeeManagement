package com.employee.management.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

public class EmployeeRepositoryImpl implements EmployeeRepositoryCustom {

	@Autowired
	private MongoTemplate mongoTemplate;
}
