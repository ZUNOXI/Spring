package edu.ssafy.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.util.DefaultPropertiesPersister;

@SpringBootApplication
public class BootWebApplication {

	public static void main(String[] args) {
		//SpringApplication.run(BootWebApplication.class, args);
		
		new SpringApplicationBuilder(BootWebApplication.class)
		.properties("spring.config.loacation=classpath:/application.properties,classpath:/application.yml")
		.run(args);
	}

}
