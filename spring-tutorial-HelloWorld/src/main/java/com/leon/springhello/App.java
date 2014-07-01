package com.leon.springhello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.leon.springhello.listofbeans.Jungle;
import com.leon.springhello.mapofbeans.Jungle2;

public class App {
	
	
	public static void main(String[] args) {
		//ApplicationContext applicationContext = 
		//		new FileSystemXmlApplicationContext("src/main/java/com/leon/springhello/beans/beans.xml");
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("com/leon/springhello/beans/beans.xml");
		
		//Person person = new Person();
		//Person person = applicationContext.getBean(Person.class);
		Person person1 = (Person) applicationContext.getBean("person");
		person1.setTaxId(555);
		person1.speak();
		
		Address address = (Address) applicationContext.getBean("address");
		System.out.println(address);
		
		System.out.println(person1);
		
		
		Person person2 = (Person) applicationContext.getBean("person2");
		System.out.println(person2);
		
		//Address address2 = applicationContext.getBean(Address.class);
		Address address2 = (Address) applicationContext.getBean("address2");
		System.out.println(address2);
		
		FruitBasket fruitBasket = applicationContext.getBean(FruitBasket.class);
		System.out.println(fruitBasket);
		
		Jungle jungle = applicationContext.getBean(Jungle.class);
		System.out.println(jungle);
		
		Jungle2 jungle2 = applicationContext.getBean(Jungle2.class);
		System.out.println(jungle2);
		
		//((FileSystemXmlApplicationContext)applicationContext).close();
		((ClassPathXmlApplicationContext)applicationContext).close();
	}
}
