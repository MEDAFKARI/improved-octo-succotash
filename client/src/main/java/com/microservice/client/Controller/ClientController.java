package com.microservice.client.Controller;


import com.microservice.client.DAO.Entity.Client;
import com.microservice.client.DAO.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController{
    @Autowired
    private ClientRepository clientRepository;


    @GetMapping("/clients")
    public ResponseEntity<List<Client>> FindAll(){
        return new ResponseEntity<>(clientRepository.findAll(), HttpStatus.OK);
    }


    @GetMapping("/testx")
    public String test(){
        return "Zeb";
    }

    @GetMapping("/client/{id}")
    public Client findById (@PathVariable String id) throws Exception{

        return this.clientRepository.findById(id).orElseThrow(()-> new Exception("Client inexistant"));
    }



}
