package com.com470.validadorExtranjeria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ValidadorExtranjeriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValidadorExtranjeriaApplication.class, args);
	}

    public boolean validar(String number) {
		return number.matches("E-\\d{8}");
    }
}
