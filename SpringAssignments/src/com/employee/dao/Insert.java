package com.employee.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Insert {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springconfg.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("EmployeeDao");
	}

}
