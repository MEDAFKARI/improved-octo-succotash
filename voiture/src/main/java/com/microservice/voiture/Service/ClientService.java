package com.microservice.voiture.Service;

import com.microservice.voiture.Model.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="CLIENT-SERVICE")
public interface ClientService{
    @GetMapping("/client/{id}")
    public Client clientById(@PathVariable Long  id);
}
