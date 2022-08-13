package com.khela;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EntityScan("com.khela.entity")
@ComponentScan("com.khela.**")
public class KhelaComputerApplication {
	public static void main(String[] args) {
		SpringApplication.run(KhelaComputerApplication.class, args);
	}

}
