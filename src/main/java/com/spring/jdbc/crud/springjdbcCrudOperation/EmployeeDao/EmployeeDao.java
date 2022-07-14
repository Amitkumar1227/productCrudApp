package com.spring.jdbc.crud.springjdbcCrudOperation.EmployeeDao;

public interface EmployeeDao<Employee> {
	public abstract void createEmployee(Employee employee);
	public abstract Employee fetchEmployeeById(Integer EmployeeId);

}
