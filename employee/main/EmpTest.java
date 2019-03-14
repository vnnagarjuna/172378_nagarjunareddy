package com.employee.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.employee.dao.EmployeeDaoImpl;
import com.employee.pojo.Employee;
import com.employee.services.EmployeeServicesImpl;

public class EmpTest {

	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("employee.xml");
		Employee e=new Employee();
        e.setEmpid(125);
        e.setEname("nag");
        e.setJob("a4");
        e.setMgr(0);
        e.setSal(35000);
        e.setComm(0);
        e.setDeptno(20);
        
        EmployeeDaoImpl d=(EmployeeDaoImpl)c.getBean("edao");
        d.insert(e);
        
        d.delete(e);
        EmployeeServicesImpl ser=new EmployeeServicesImpl();
        ser.updateEmpSal(e);
        List<Employee> list= ser.getEmp(e);
       
       for(Employee e1:list)
         {        	 System.out.println(e1);
         }
	}

}

