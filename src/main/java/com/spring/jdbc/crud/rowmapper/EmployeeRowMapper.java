package com.spring.jdbc.crud.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.crud.springjdbcCrudOperation.entities.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
	Employee employee=new Employee();
	employee.setEmployeeId(rs.getInt("employeeId"));
	employee.setEmployeeName(rs.getString("employeeName"));
	employee.setEmail(rs.getString("email"));
	employee.setGender(rs.getString("gender"));
	employee.setSalary(rs.getDouble("salary"));
	
		return employee ;
	}

}
