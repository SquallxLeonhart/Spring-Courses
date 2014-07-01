package com.leon.springhello;

public class Person {
	private int id;
	private String name;
	private int taxId;
	private Address address;
	
	public Person() {
		
	}
	
	public static Person getInstance(int id, String name) { //Factory method, no importa el nombre
		System.out.println("Creating person using factory method");
		return new Person(id, name);
	}
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void onCreate() { // el nombre no importa
		System.out.println("Person created: " + this);
	}
	
	public void onDestroy() { //el nombre no importa
		System.out.println("Person destroyed");
	}


	public void speak() {
		System.out.println("Hello I´m a Person");
	}


	/**
	 * @param taxId the taxId to set
	 */
	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId
				+ ", address=" + address + "]";
	}

	
	
}
