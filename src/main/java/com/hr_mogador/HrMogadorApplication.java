package com.hr_mogador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.hr_mogador.entities")
public class HrMogadorApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrMogadorApplication.class, args);
	}

}
