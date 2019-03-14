package com.spring.practice;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Drawing {

	public static void main(String[] args) {
		//BeanFactory factory =new XmlBeanFactory(new FileSystemResource("sp.xml"));
		//factory.getBean("Circle");
		ApplicationContext context = new ClassPathXmlApplicationContext("sp.xml");
		
		Circle circle =  (Circle) context.getBean("Circle");
		circle.draw();
	}

}
