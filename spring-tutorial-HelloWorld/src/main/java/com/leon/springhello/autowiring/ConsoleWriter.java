package com.leon.springhello.autowiring;

public class ConsoleWriter implements LogWriter {

	public void write(String text) {
		System.out.println(text);
	}
	
}
