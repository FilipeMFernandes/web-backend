package com.mapri.webbackend.repository;

import com.mapri.webbackend.domain.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProviderRepository extends JpaRepository<Provider,Long> {
}
