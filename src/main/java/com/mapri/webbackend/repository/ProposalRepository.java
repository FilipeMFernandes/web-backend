package com.mapri.webbackend.repository;

import com.mapri.webbackend.domain.Proposal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProposalRepository extends JpaRepository<Proposal,Long> {

}
