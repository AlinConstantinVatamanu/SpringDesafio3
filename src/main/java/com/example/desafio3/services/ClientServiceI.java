package com.example.desafio3.services;

import java.util.Date;
import java.util.List;

import com.example.desafio3.model.Client;

public interface ClientServiceI {

	public void insertClient(
				String name,
				String surname1,
				String surname2,
				String birthDate,
				String dni
			);
	
	public Client findByNameAndSurnames(
				String name, String surname1, String surname2
			);

	public void updateClient(Client client);
	
	public void deleteClient(Client client);
	
	public Client findById(Long id);
	
	public List<Client> findAll();
}
