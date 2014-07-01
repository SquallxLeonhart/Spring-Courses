package com.leon.springhello.autowiring.annotations.componentscan;

import org.springframework.stereotype.Component;

@Component
public class ConsoleWriter2 implements LogWriter2 {
	public void write(String text) {
		System.out.println(text);
	}
	
}
