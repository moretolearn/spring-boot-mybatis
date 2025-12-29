package com.moretolearn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeMapper employeeMapper;
	
	@GetMapping
	public List<Employee> getAllEmployee() {
		List<Employee> all = employeeMapper.findAll();
		return all;
	}
	
	@PostMapping
	public Integer getAllEmployee(@RequestBody Employee employee) {
		Integer saveEmployee = employeeMapper.save(employee);
		return saveEmployee;
	}

}
