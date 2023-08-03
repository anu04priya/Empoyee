package com.cg.ed.Service;

import java.util.List;

import com.cg.ed.EmployeeEntity.Employee;

public interface EmployeeService {
	
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployees();

}
