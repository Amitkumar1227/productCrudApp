package com.spring.jdbc.crud.springjdbcCrudOperation;

import com.spring.jdbc.crud.springjdbcCrudOperation.EmployeeDao.EmployeeDao;
import com.spring.jdbc.crud.springjdbcCrudOperation.entities.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDao<Employee> employeeDao;
	
	public EmployeeDao<Employee> getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao<Employee> employeeDao) {
		this.employeeDao = employeeDao;
	}

	public void createEmployee(Employee employee) {
		
		getEmployeeDao().createEmployee(employee);
	}

	public Employee getEmployeeById(Integer EmployeeId) {
	
		return (Employee) getEmployeeDao().fetchEmployeeById(EmployeeId);
	}

	
	
	

	

}
