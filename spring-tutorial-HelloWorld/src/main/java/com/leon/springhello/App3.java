package com.leon.springhello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.leon.springhello.autowiring.annotations.Logger3;

public class App3 {
	public static void main(String[] args) {
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("com/leon/springhello/beans/beans3.xml");
		
		Logger3 logger3 = applicationContext.getBean(Logger3.class);
		logger3.writeConsole("Hellow there");
		logger3.writeFile("Hi again");
		
		/*
		Logger2 logger2 = applicationContext.getBean(Logger2.class);
		logger2.writeConsole("Hellow there");
		logger2.writeFile("Hi again");*/

		
		((ClassPathXmlApplicationContext)applicationContext).close();
	}
}
