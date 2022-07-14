package com.spring.jdbc.crud.springjdbcCrudOperation;



import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.crud.springjdbcCrudOperation.entities.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context= null;
    	try {
    	 context= 
    			new ClassPathXmlApplicationContext("springjdbcCrudOperation/src/main/java/com/spring/jdbc/crud/springjdbcCrudOperation/config.xml");
    	EmployeeService employeeService = context.getBean(EmployeeServiceImpl.class);
    	createEmployee(employeeService);
    	createEmployeeById(employeeService);
    	
    	}catch(Exception e) {e.printStackTrace();}
    	/*finally {
		
			if(context!= null)
				context.close();} */
    	
       
    }

	private static void createEmployeeById(EmployeeService employeeService) {
		Employee employeeById = employeeService.getEmployeeById(1);
    	System.out.println(employeeById);
	}

	private static void createEmployee(EmployeeService employeeService) {
		Employee employee= getEmployee();
		employeeService.createEmployee(employee);
	}

	private static Employee getEmployee() {
		Employee employee=new Employee();
		employee.setGender("Amit");
		employee.setEmail("amitkumar@gmail.com");
		employee.setGender("male");
		employee.setSalary(450000.00);
		
		
		return employee;
	}
}
