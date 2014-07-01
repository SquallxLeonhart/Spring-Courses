package com.leon.springhello.listofbeans;

import java.util.List;

public class Jungle {
	private Animal largest;
	private List<Animal> listAnimals;
	/**
	 * @return the largest
	 */
	public Animal getLargest() {
		return largest;
	}
	/**
	 * @param largest the largest to set
	 */
	public void setLargest(Animal largest) {
		this.largest = largest;
	}
	/**
	 * @return the listAnimals
	 */
	public List<Animal> getListAnimals() {
		return listAnimals;
	}
	/**
	 * @param listAnimals the listAnimals to set
	 */
	public void setListAnimals(List<Animal> listAnimals) {
		this.listAnimals = listAnimals;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("largest: " + largest);
		sb.append("\n");
		sb.append("Others: \n");
		
		for (Animal animal : listAnimals) {
			sb.append(animal);
			sb.append("\n");
		}
		
		return sb.toString();
	}

}
