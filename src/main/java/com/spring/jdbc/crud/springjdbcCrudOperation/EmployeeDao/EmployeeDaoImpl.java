package com.spring.jdbc.crud.springjdbcCrudOperation.EmployeeDao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.crud.rowmapper.EmployeeRowMapper;
import com.spring.jdbc.crud.springjdbcCrudOperation.entities.Employee;




public class EmployeeDaoImpl implements EmployeeDao<Employee>{
	private JdbcTemplate jdbcTemplate;
	
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void createEmployee(Employee employee) {
	String query="inset into employee_table(employee_name,email,gender,salary) values(?,?.?.?)";
	int update=	getJdbcTemplate().update(query, employee.getEmployeeName(),employee.getEmail(), employee.getGender(), employee.getSalary());
      if(update==1)
    	  System.out.println("employee is added");
	}

	public Employee fetchEmployeeById(Integer EmployeeId) {
	     String query="select * from emloyee_table where employee_id=?";
	     Employee employee = getJdbcTemplate().queryForObject(query,new EmployeeRowMapper(), EmployeeId);
	     return employee;
	}



	
	

}
