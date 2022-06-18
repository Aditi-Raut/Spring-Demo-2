package com.aditi.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		       //read spring config file
				ClassPathXmlApplicationContext context = 
						new ClassPathXmlApplicationContext("applicationContext.xml");
				
				//get the bean from spring container
				Coach theCoach = context.getBean("tennisCoach", Coach.class);
				
				Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
				
				
				//call methods on bean 
				boolean result = (theCoach == alphaCoach);
				System.out.println("\nPointing to the same object: " + result);
				
				System.out.println("\nMemory Location of the Coach: " + theCoach);
				
				System.out.println("\nMemory Location of alpha Coach: " + alphaCoach);
				
				
				//close context
				context.close();

	}

}
