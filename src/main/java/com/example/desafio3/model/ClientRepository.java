package com.example.desafio3.model;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

	public Client findByNameAndSurname1AndSurname2(String name, String surname1, String surname2);
	
}
