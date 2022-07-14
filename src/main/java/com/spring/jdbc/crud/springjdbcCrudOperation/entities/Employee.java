package com.spring.jdbc.crud.springjdbcCrudOperation.entities;



public class Employee {

		private Integer employeeId;
		public Employee(Integer employeeId, String employeeName, String email, String gender, Double salary) {
			super();
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.email = email;
			this.gender = gender;
			this.salary = salary;
		}
		public Integer getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(Integer employeeId) {
			this.employeeId = employeeId;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public Double getSalary() {
			return salary;
		}
		public void setSalary(Double salary) {
			this.salary = salary;
		}
		private String employeeName;
		private String email;
		private String gender;
		private Double salary;
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", email=" + email
					+ ", gender=" + gender + ", salary=" + salary + "]";
		}
		
		
	

}
