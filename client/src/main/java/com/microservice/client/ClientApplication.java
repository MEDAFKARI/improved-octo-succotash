package com.microservice.client;

import com.microservice.client.DAO.Entity.Client;
import com.microservice.client.DAO.Repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

	@Bean
	CommandLineRunner initialiserBaseH2(ClientRepository clientRepository)  {
		return  args  ->  {
			clientRepository.save(new Client(Long.parseLong("1"), "Rabab SELIMANI", null ));
			clientRepository.save(new  Client(Long.parseLong("2"),  "Amal  RAMI", null ));
			clientRepository.save(new  Client(Long.parseLong("3"),  "Samir  SAFI", null ));

		};
	}


}
