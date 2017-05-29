package com.capgemini.spring.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capgemini.spring.services.MessageService;

/**
 * Configurazione di Spring (rimpiazzo del vecchio ApplicationContext.xml)
 * 
 * @author Christian Lusardi
 * @version 1.0
 *
 */
@Configuration
public class SpringConfiguration {
	
	
	
	/**
	 * Definizio del bean di mock per testare il servizio di stampa del
	 * messaggio
	 * 
	 * @return {@link MessageService} mock del servizio che stampa "Hello
	 *         World!"
	 */
	@Bean
	MessageService mockMessageService() {
		
		
		// Java 8 - Lambda  (solo per i pro)
		
		return () -> "Hello World";
				
				

		//Anonymous Inner Class Style (per tutti gli altri)
		
		/*
		return new MessageService() {
			public String getMessage() {
				return "Hello World!";
			}
		};
		*/
		
	}

}
