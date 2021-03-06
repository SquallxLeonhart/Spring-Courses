package com.leon.springhello.autowiring.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import com.leon.springhello.autowiring.ConsoleWriter;
import com.leon.springhello.autowiring.LogWriter;

public class Logger4 {
	//@Resource
	@Inject
	@Named(value = "consoleWriter")
	private ConsoleWriter consoleWriter;
	//@Resource(name="squirrel")
	@Inject()
	@Named(value = "fileWriter")
	private LogWriter fileWriter;
	
	/**
	 * @param consoleWritter the consoleWritter to set
	 */
	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}
	/**
	 * @param filterWritter the filterWritter to set
	 */
	public void setFileWriter(LogWriter fileWriter) {
		this.fileWriter = fileWriter;
	}
	
	public void writeFile(String text) {
		fileWriter.write(text);
	}
	
	public void writeConsole(String text) { 
		consoleWriter.write(text);
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init");
	}
	
	// El scope de Logger4 debe ser singleton. Si es prototype,
	// deja al programador la funci�n.
	@PreDestroy
	public void destroy() {
		System.out.println("destroy");
	}
}
