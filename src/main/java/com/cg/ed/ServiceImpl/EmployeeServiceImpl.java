package com.cg.ed.ServiceImpl;

import java.util.List;

//import org.hibernate.mapping.List;

//import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.ed.EmployeeEntity.Employee;
import com.cg.ed.Repository.EmployeeRepository;
import com.cg.ed.Service.EmployeeService;
//import com.cg.ed.Service.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository employeeRepository;
	
	

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}



	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}



	@Override
	public List<Employee> getAllEmployees() {	
		return employeeRepository.findAll();
	}

}
