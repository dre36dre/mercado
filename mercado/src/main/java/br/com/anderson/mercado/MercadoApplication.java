package br.com.anderson.mercado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MercadoApplication {

	public static void main(String[] args) {
		System.out.println("Bem vindo ao mercado");
		SpringApplication.run(MercadoApplication.class, args);
	}

}
