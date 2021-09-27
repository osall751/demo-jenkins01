package com.example.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJenkins01Application {

	public static final Logger log = LoggerFactory.getLogger(DemoJenkins01Application.class);

	@PostConstruct
	public void init() {
		log.info("Démarrage de l'application...");
	}

	public static void main(String[] args) {
		log.info("Exécution de l'application...");
		SpringApplication.run(DemoJenkins01Application.class, args);
	}

}
