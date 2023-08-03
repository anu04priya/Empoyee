package com.cg.ed.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ed.EmployeeEntity.Employee;
//import com.cg.ed.Repository.EmployeeRepository;
import com.cg.ed.Service.EmployeeService;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@PostMapping("employees")
	public ResponseEntity<Employee>saveEmployee(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee),HttpStatus.CREATED);
	}
	
	@GetMapping("/api/v1/getemployee")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}



	
	

}
