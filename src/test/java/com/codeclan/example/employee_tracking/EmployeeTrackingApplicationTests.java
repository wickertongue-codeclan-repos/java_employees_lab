package com.codeclan.example.employee_tracking;

import com.codeclan.example.employee_tracking.models.Employee;
import com.codeclan.example.employee_tracking.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeTrackingApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateEmployee() {
		Employee employee = new Employee("Bertie", 54, 2, "bertie.smith@email.com");
		employeeRepository.save(employee);
	}

}
