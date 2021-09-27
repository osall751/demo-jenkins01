package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoJenkins01ApplicationTests {

	
	public static final Logger log = LoggerFactory.getLogger(DemoJenkins01ApplicationTests.class);

	@Test
	void contextLoads() {
		log.info("### Excécution d'un Test ...");
		assertEquals(true, true);
	}

}
