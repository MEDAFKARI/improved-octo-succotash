package com.microservice.client.DAO.Repository;


import com.microservice.client.DAO.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, String> {

}
