package com.leon.springhello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.leon.springhello.autowiring.annotations.Logger4;

public class App4 {
	public static void main(String[] args) {
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("com/leon/springhello/beans/beans4.xml");
		
		Logger4 logger4 = applicationContext.getBean(Logger4.class);
		logger4.writeConsole("Hellow there");
		logger4.writeFile("Hi again");
				
		((ClassPathXmlApplicationContext)applicationContext).close();
	}
}
