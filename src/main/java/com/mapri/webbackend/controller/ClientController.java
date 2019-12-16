package com.mapri.webbackend.controller;

import com.mapri.webbackend.domain.Client;
import com.mapri.webbackend.repository.ClientRepository;
import com.mapri.webbackend.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client")
public class ClientController {
    @Autowired
    ClientRepository clientRepository;

    @Autowired
    ClientService clientService;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Client> findAll (){
        Iterable<Client> all = clientRepository.findAll();
        return all;
    }
    @RequestMapping(method = RequestMethod.POST)
    public Client save (@RequestBody Client client){
        Client c = clientService.save(client);
        return c;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Client update (@RequestBody Client client){
        Client c = clientRepository.save(client);
        return c;
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void delete (@RequestBody Client client){
        clientRepository.deleteById(client.getId());
    }
}
