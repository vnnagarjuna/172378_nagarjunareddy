package com.employee.dao;

import java.util.List;



public interface EmployeeServices {

	public boolean addEmp(Employee e);
	public List<Employee> getEmp(Employee e);
	public boolean updateEmpSal(Employee e);
	
}
