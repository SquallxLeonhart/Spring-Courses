package com.leon.springhello.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.leon.springhello.autowiring.ConsoleWriter;
import com.leon.springhello.autowiring.FileWriter;
import com.leon.springhello.autowiring.LogWriter;

public class Logger3 {
	//Annotations en fields no necesitan los mutators para inyectarse. 
	//USAN EL CONSTRUCTOR POR DEFAULT
	//El atributo required lo que hace es inyectar el bean sólo si existe en el bean.xml.
	//Si no lo encuentra no lo inyecta y funciona.
	//@Autowired(required = false)
	@Autowired
	@Qualifier("toconsole") //toconsole Es el nombre qualifier que están en el bean ConsoleWriter en beans3.xml
	private ConsoleWriter consoleWriter;
	@Autowired
	@Qualifier("fileWriter") //fileWriter Es el nombre qualifer en la clase FileWriter
	private LogWriter fileWriter;
	
	/*@Autowired	
	public Logger3(ConsoleWriter consoleWriter, FileWriter fileWriter) {
		this.consoleWriter = consoleWriter;
		this.fileWriter = fileWriter;
	}*/
	
	//@Autowired	
	/*public Logger3(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}*/
	
	/**
	 * @param consoleWritter the consoleWritter to set
	 */
	//@Autowired
	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}
	/**
	 * @param filterWritter the filterWritter to set
	 */
	//Autowired annotation wired by type. You can name the method whatever you want
	//@Autowired
	public void setFileWriter(LogWriter fileWriter) {
		this.fileWriter = fileWriter;
	}
	
	public void writeFile(String text) {
		fileWriter.write(text);
	}
	
	public void writeConsole(String text) {
		if (consoleWriter != null) {
			consoleWriter.write(text);	
		}
	}
}
