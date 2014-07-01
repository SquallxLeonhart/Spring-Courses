package com.leon.springhello.autowiring.annotations.componentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App5 {
	public static void main(String[] args) {
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("com/leon/springhello/beans/beans5.xml");
		Logger5 logger5 = applicationContext.getBean(Logger5.class);
		logger5.writeConsole("Hellow there");
		logger5.writeFile("Hi again");
		
		Robot robot = applicationContext.getBean(Robot.class);
		robot.speak();
		
		Robot2 robot2 = applicationContext.getBean(Robot2.class);
		robot2.speak();
		
		((ClassPathXmlApplicationContext)applicationContext).close();
	}
}
