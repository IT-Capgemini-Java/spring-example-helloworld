package com.capgemini.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.capgemini.spring.components.MessagePrinter;



/**
 * Hello world in Spring
 * 
 * @author Christian Lusardi
 * @version 1.0
 *
 */
@ComponentScan
public class App {
	
	
	
	//Logger
	private static final Logger log = LoggerFactory.getLogger(App.class);
	
	
	
	
	
	/**
	 * Main
	 * 
	 * @param args (per l'esempio non ci sono argomenti)
	 */
	public static void main(String[] args) {
		
		//Inizializzazione del contesto di spring
		try (ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(App.class)) {
			
			//Inizializzazione del servizio di stampa del messaggio
			MessagePrinter printer = context.getBean(MessagePrinter.class);
			
			//Esecuzione della procedura di stampa del messaggio
			printer.printMessage();
			
		} catch (Exception e) {
			
			//Gestione dell'errore
			log.error("Errore durante esecuzione del programma.",e.getMessage(), e);
		}
	}
	
}
