package com.livraria.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.livraria.api.entities.Sumario;

@SpringBootApplication
public class LivrariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LivrariaApplication.class, args);  
		Sumario list = new Sumario();
		Sumario su = new Sumario("teste", "123");
		list.add(su);
		System.out.println(list);
	}

}
