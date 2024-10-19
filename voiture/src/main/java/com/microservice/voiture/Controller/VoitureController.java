package com.microservice.voiture.Controller;

import com.microservice.voiture.DAO.Entity.Voiture;
import com.microservice.voiture.DAO.Repository.VoitureRepository;
import com.microservice.voiture.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class VoitureController {

    @Autowired
    private VoitureRepository voitureRepository;

    @Autowired
    private ClientService clientService;

    @GetMapping("/voitures")
    public ResponseEntity<?> FindAllCars(){
        List<Voiture> Voitures= voitureRepository.findAll().stream().map(
               v-> {
                        v.setClient(clientService.clientById(v.getId_client()x));
        return v; // Return the modified car object
    }
        ).collect(Collectors.toList());
        return new ResponseEntity<>(voitureRepository.findAll(), HttpStatus.OK);
    }



}
