package com.mapri.webbackend.repository;

import com.mapri.webbackend.domain.Request;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<Request,Long> {

}
