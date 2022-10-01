package com.app.services;

import com.app.dto.EmployeeActualDTO;
import com.app.dto.EmployeeDTO;
import com.app.entities.Employee;

public interface IEmployeeService {
	
	public Employee getEmployeeDetails(int id,String Password);
	
	Employee updateEmployeeDetails(EmployeeDTO e);

	EmployeeActualDTO findUsingId(int id);

}
