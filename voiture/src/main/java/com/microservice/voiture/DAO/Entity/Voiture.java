package com.microservice.voiture.DAO.Entity;


import com.microservice.voiture.Model.Client;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Voiture{
    @Id
    @GeneratedValue
    private Long id;
    private  String  marque;
    private String matricule;
    private  String  model;
    private  Long  id_client;

    @Transient
    @ManyToOne
    private Client client;
}
