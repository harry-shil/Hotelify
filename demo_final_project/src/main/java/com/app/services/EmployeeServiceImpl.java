package com.app.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.app.dao.IEmployeeRepo;
import com.app.dto.EmployeeActualDTO;
import com.app.dto.EmployeeDTO;
import com.app.dto.ManagerActualDTO;
import com.app.entities.Employee;
import com.app.entities.Manager;

public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	IEmployeeRepo empRepo;
	
	@Autowired
	private ModelMapper mapper;

	@Override
	public Employee getEmployeeDetails(int id, String Password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployeeDetails(EmployeeDTO e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeActualDTO findUsingId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
