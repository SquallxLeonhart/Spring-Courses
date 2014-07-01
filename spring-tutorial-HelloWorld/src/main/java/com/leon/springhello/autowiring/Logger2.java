package com.leon.springhello.autowiring;

public class Logger2 {
	private LogWriter consoleWriter;
	private LogWriter fileWriter;
	
	public Logger2(ConsoleWriter consoleWriter, FileWriter fileWriter) {
		this.consoleWriter = consoleWriter;
		this.fileWriter = fileWriter;
	}
	
	/**
	 * @param consoleWritter the consoleWritter to set
	 */
	public void setConsoleWriter(LogWriter consoleWriter) {
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
}
