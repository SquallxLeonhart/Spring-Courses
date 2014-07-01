package com.leon.springhello.autowiring.annotations.componentscan;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.stereotype.Component;

@Component
public class Logger5 {
	//@Resource
		@Inject		
		private ConsoleWriter2 consoleWriter;
		
		@Inject()
		@Named("fileWriter")
		private LogWriter2 fileWriter;
		
		/**
		 * @param consoleWritter the consoleWritter to set
		 */
		public void setConsoleWriter(ConsoleWriter2 consoleWriter) {
			this.consoleWriter = consoleWriter;
		}
		/**
		 * @param filterWritter the filterWritter to set
		 */
		public void setFileWriter(LogWriter2 fileWriter) {
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
		// deja al programador la función.
		@PreDestroy
		public void destroy() {
			System.out.println("destroy");
		}
}
