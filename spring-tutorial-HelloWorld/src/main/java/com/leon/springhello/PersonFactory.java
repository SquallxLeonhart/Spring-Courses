package com.leon.springhello;

public class PersonFactory {
	public Person createPerson(int id, String name) {
		System.out.println("Using Factory to create person");
		return new Person(id, name);
	}
}
