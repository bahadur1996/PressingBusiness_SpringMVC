package com.khela;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan("com.khela.entity")
public class KhelaComputerApplication {
	public static void main(String[] args) {
		SpringApplication.run(KhelaComputerApplication.class, args);
	}

}
