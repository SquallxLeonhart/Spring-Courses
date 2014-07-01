package com.leon.springhello.autowiring.annotations.componentscan;

import org.springframework.stereotype.Component;

@Component("fileWriter")
public class FileWriter2 implements LogWriter2 {
	public void write(String text)  {
		System.out.println("Write fo file: " + text);
	}
}
