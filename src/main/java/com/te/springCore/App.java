package com.te.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Hello World!");
//		ApplicationContext context = new ClassPathXmlApplicationContext(
//				"config.xml");
//	ApplicationContext context=	new ClassPathXmlApplicationContext("config2.xml");
		ApplicationContext context=	new ClassPathXmlApplicationContext("config3.xml");
		   Student student3 = (Student) context.getBean("student1");
		 Student student4=  (Student) context.getBean("student2");
		   
		   System.out.println(student3);
		   System.out.println(student4);
		
	}
}
