package com.iimakis.ticketsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TicketSystem {

	public static void main(String[] args) throws Exception {
    	SpringApplication app = new SpringApplication(TicketSystem.class);
    	app.setAddCommandLineProperties(false);
        app.run();
    }
}
