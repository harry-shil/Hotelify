package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.entities.Employee;

public interface IEmployeeRepo extends JpaRepository<Employee, Integer> {

	

}
