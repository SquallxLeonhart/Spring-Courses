package com.leon.springhello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.leon.springhello.autowiring.Logger;
import com.leon.springhello.autowiring.Logger2;

public class App2 {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("com/leon/springhello/beans/beans2.xml");
		
		Logger logger = applicationContext.getBean(Logger.class);
		logger.writeConsole("Hellow there");
		logger.writeFile("Hi again");
		
		/*
		Logger2 logger2 = applicationContext.getBean(Logger2.class);
		logger2.writeConsole("Hellow there");
		logger2.writeFile("Hi again");*/

		
		((ClassPathXmlApplicationContext)applicationContext).close();
	}
}
