package com.employee.dao;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c =new ClassPathXmlApplicationContext("springconfg.xml");
		Employee e=new Employee();
        e.setEmpid(1113);
       e.setEname("nag");
        e.setJob("a4o");
        e.setMgr(0);
        e.setSal(29999);
//        e.setComm(0);
//        e.setDeptno(20);
        
        EmployeedaoImpl d=(EmployeedaoImpl)c.getBean("edao");
        d.insert(e);
        System.out.println("abc");
       // d.delete(e);
		/*
		 * EmployeeServicesImpl ser=new EmployeeServicesImpl(); ser.updateEmpSal(e);
		 */
//         List<Employee> list= ser.getEmp(e);
//        
//         for(Employee e1:list)
//         {
//        	 System.out.println(e1);
//         }
	}

}
