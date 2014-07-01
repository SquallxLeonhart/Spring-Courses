package com.leon.springhello.autowiring;

import org.springframework.beans.factory.annotation.Qualifier;

// Se agrega la anotaci�n en lugar del tag en el xml debido a que LogWriter es una interfaz y no est� definida en el xml.
@Qualifier("fileWriter")
public class FileWriter implements LogWriter {

	public void write(String text) {
		System.out.println("Write fo file: " + text);
	}

}
