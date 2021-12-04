package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		boolean result = (theCoach == alphaCoach);
				
		System.out.println("\n Pointing to the some object : " + result );
		System.out.println("\n Memory location theCoach : " + theCoach);
		System.out.println("\n Memory location alphaCoach : " + alphaCoach);
		
		
		context.close();
		
	}

}
