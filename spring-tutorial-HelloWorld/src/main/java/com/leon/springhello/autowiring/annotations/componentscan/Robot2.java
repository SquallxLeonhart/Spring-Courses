package com.leon.springhello.autowiring.annotations.componentscan;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Robot2 {
	private String id = "Default robot";
	private String speech = "hello";

	public void speak() {
		System.out.println(id + ": " + speech);
	}

	/**
	 * @param id
	 *            the id to set
	 */
	@Inject
	public void setId(@Value("#{randomText.getText()?.length()}") String id) {
		this.id = id;
	}

	/**
	 * @param speech
	 *            the speech to set
	 */
	@Inject
//	public void setSpeech(@Value("#{randomText.getText()}") String speech) {
//	public void setSpeech(@Value("#{new java.util.Date().toString()}") String speech) {
	//Accessing static fields and methods
	//le->less lt->less than le->less equals  eq->equals
	public void setSpeech(@Value("#{T(Math).sin(T(Math).PI/4) ^ 2 le 0.8 ? 'yes' : 'no'}") String speech) {
		this.speech = speech;
	}
}
