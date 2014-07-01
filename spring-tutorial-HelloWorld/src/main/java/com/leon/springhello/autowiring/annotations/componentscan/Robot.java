package com.leon.springhello.autowiring.annotations.componentscan;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Robot {
//	@Inject
//	@Value("1138")
	private int id = 0;
	private String speech = "hello";
	
	public void speak() {
		System.out.println(id + ": " + speech);
	}

	/**
	 * @param id the id to set
	 */
	@Inject
	public void setId(@Value("1138") int id) {
		this.id = id;
	}

	/**
	 * @param speech the speech to set
	 */
	@Inject
	public void setSpeech(@Value("I'll be back") String speech) {
		this.speech = speech;
	}
}
