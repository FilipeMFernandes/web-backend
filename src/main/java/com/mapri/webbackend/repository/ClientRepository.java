package com.mapri.webbackend.repository;

import com.mapri.webbackend.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
