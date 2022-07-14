package com.spring.jdbc.crud.springjdbcCrudOperation;

import com.spring.jdbc.crud.springjdbcCrudOperation.entities.Employee;

public interface EmployeeService {
	public abstract void createEmployee(Employee employee);
	public abstract Employee getEmployeeById(Integer EmployeeId);

}
