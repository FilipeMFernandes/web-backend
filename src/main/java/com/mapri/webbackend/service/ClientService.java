package com.mapri.webbackend.service;

import com.mapri.webbackend.domain.Client;
import com.mapri.webbackend.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClientService implements UserDetailsService {

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    private PasswordEncoder bcryptEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Client client = clientRepository.findByCpf(username);
        if (client != null) {
            return new User(client.getCpf(), client.getPassword(), new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }

    public Client save(Client client) {
        Client savedClient = new Client();
        savedClient.setName(client.getName());
        savedClient.setCpf(client.getCpf());
        savedClient.setPassword(bcryptEncoder.encode(client.getPassword()));
        return clientRepository.save(savedClient);
    }
}
