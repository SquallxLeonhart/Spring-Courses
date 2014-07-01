package com.leon.springhello.autowiring;

public class Logger {
	private ConsoleWriter consoleWriter;
	private FileWriter fileWriter;
	
	/**
	 * @param consoleWritter the consoleWritter to set
	 */
	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}
	/**
	 * @param filterWritter the filterWritter to set
	 */
	public void setFileWriter(FileWriter fileWriter) {
		this.fileWriter = fileWriter;
	}
	
	public void writeFile(String text) {
		fileWriter.write(text);
	}
	
	public void writeConsole(String text) { 
		consoleWriter.write(text);
	}
	
}
