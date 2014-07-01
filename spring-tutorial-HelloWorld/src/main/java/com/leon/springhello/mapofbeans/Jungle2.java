package com.leon.springhello.mapofbeans;

import java.util.HashMap;
import java.util.Map;

import com.leon.springhello.listofbeans.Animal;

public class Jungle2 {
	private Map<String, String> foods = new HashMap<String, String>();
	private Map<String, Animal> animals = new HashMap<String, Animal>();
	
	/**
	 * @param foods the foods to set
	 */
	public void setFoods(Map<String, String> foods) {
		this.foods = foods;
	}

	
	/**
	 * @param animals the animals to set
	 */
	public void setAnimals(Map<String, Animal> animals) {
		this.animals = animals;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for (Map.Entry<String, String> entry : foods.entrySet()) {
			sb.append(entry.getKey() + ": " + entry.getValue() + "\n");
		}
		
		sb.append("\n");
		
		for (Map.Entry<String, Animal> entry : animals.entrySet()) {
			sb.append(entry.getKey() + ": " + entry.getValue() + "\n");
		}
		
		return sb.toString();
	}
	
	

}
