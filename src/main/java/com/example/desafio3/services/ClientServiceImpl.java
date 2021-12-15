package com.example.desafio3.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.desafio3.model.Client;
import com.example.desafio3.model.ClientRepository;

@Service
public class ClientServiceImpl implements ClientServiceI {

	@Autowired
	private ClientRepository clientRepository;


	@Override
	public void insertClient(String name, String surname1, String surname2, String birthDate, String dni) {
		 Client client = new Client();
		 client.setName(name);
		 client.setSurname1(surname1);
		 client.setSurname2(surname2);
		 client.setBirthDate(birthDate);
		 client.setDni(dni);
		 clientRepository.save(client);	
	}

	@Override
	public void updateClient(Client client) {
		clientRepository.save(client);
	}

	@Override
	public void deleteClient(Client client) {
		clientRepository.delete(client);
	}

	@Override
	public Client findById(Long id) {
		return clientRepository.findById(id).get();
	}
	
	@Override
	public List<Client> findAll() {
		return clientRepository.findAll();
	}
	
	@Override
	public Client findByNameAndSurnames(String name, String surname1, String surname2) {
		Client client = clientRepository.findByNameAndSurname1AndSurname2("Alin", "Constantin", "Vatamanu");
		return client;
	}	
}
