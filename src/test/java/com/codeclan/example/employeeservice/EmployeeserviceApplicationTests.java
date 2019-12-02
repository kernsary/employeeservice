package com.codeclan.example.employeeservice;

import com.codeclan.example.employeeservice.models.Employee;
import com.codeclan.example.employeeservice.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeserviceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployees(){
		Employee sky = new Employee("Sky Su", 18, 23, "sky@codeclan.com");
		employeeRepository.save(sky);
		Employee john = new Employee("John Harper", 19, 22, "john@codeclan.com");
		employeeRepository.save(john);
	}

}
