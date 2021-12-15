package com.example.desafio3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.desafio3.model.Client;
import com.example.desafio3.services.ClientServiceImpl;

@SpringBootApplication
public class Desafio3Application implements CommandLineRunner {

	@Autowired
	private ClientServiceImpl client;
	
	public static void main(String[] args) {
		SpringApplication.run(Desafio3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		client.insertClient("Juan", "Martinez", "Ruiz", "1992-02-17", "89761356K");
		client.insertClient("Alin", "Constantin", "Vatamanu", "1996-05-07", "12345678A");
		client.insertClient("Manuel", "Perez", "Guerra", "2000-05-07", "88888866Q");
		Client clientToFind = client.findByNameAndSurnames("Alin", "Constantin", "Vatamanu");
		
		clientToFind.setDni("44455566S");
		client.updateClient(clientToFind);
		
		client.deleteClient(clientToFind);
		
		Client clientById = client.findById(1L);
		System.out.println("El cliente buscado se llama " + clientById.getName());
		
		List<Client> listaClientes = client.findAll();
		
		System.out.println("Nombres de todos los clientes:");
		for(Client cliente:listaClientes){
	        System.out.println(cliente.getName());
	    }
	}

}
