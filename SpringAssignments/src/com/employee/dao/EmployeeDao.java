package com.employee.dao;

import java.util.List;

public interface EmployeeDao {

	public List<Employee> getAll();
	public boolean insert(Employee e);
	public boolean delete(Employee e);
	public boolean update(Employee e);
	public List<Employee> employee(Employee e);
}
