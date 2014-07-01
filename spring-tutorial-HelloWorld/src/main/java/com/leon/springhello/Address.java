package com.leon.springhello;

public class Address {
	private String street;
	private String zip;
	
	public Address() {
		
	}
	
	public Address(String street, String zip) {
		super();
		this.street = street;
		this.zip = zip;
	}
	
	public void init() { //init global
		System.out.println("Bean created: " +  this);
	}
	
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [street=" + street + ", zip=" + zip + "]";
	}
	
	
}
