package com.microservice.voiture.DAO.Repository;

import com.microservice.voiture.DAO.Entity.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoitureRepository extends JpaRepository<Voiture,Long> {
}
