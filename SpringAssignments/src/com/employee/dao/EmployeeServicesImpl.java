package com.employee.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeServicesImpl implements EmployeeServices{
	ApplicationContext c=new ClassPathXmlApplicationContext("employee.xml");
	 EmployeedaoImpl d=(EmployeedaoImpl)c.getBean("edao");
	@Override
	public boolean addEmp(Employee e) {
		
		d.insert(e);
		return true;
	}

	@Override
	public List<Employee> getEmp(Employee e) {
		return d.employee(e);
		
	}

	@Override
	public boolean updateEmpSal(Employee e) {
	  d.update(e);
		return true;
	}
	

}

