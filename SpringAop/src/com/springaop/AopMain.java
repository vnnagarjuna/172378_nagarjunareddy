package com.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springaop.service.ShapeService;

public class AopMain {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("aop.xml");
		ShapeService shapeService=ac.getBean("shapeService",ShapeService.class);
       System.out.println(shapeService.getCircle().getName());
	}

}
