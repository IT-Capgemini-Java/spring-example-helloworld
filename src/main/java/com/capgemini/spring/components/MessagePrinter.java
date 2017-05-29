package com.capgemini.spring.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.spring.services.MessageService;


/**
 * Componente di implementazione del servizio {@link MessageService}
 * 
 * @author Christian Lusardi
 * @version 1.0
 *
 */
@Component
public class MessagePrinter {
	
	
	
	//Logger
	private static final Logger log = LoggerFactory.getLogger(MessagePrinter.class);
	
	
	
	//Autowring del servizio
	@Autowired
    final private MessageService service;
	
    
	
	/**
	 * Costruttore del componente
	 * 
	 * @param service {@link MessageService}
	 */
    public MessagePrinter(MessageService service) {
        this.service = service;
    }
    
    
    
    /**
     * Procedure di stampa del messaggio
     */
    public void printMessage() {
        log.info(this.service.getMessage());
    }
}