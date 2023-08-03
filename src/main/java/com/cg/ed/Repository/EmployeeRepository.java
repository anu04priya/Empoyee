package com.cg.ed.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.ed.EmployeeEntity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee,Long>{

}
