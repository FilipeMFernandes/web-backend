package com.mapri.webbackend.controller;

import com.mapri.webbackend.domain.Proposal;
import com.mapri.webbackend.repository.ProposalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("proposal")
public class ProposalController {
    @Autowired
    ProposalRepository proposalRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Proposal> findAll(){
        Iterable<Proposal> all = proposalRepository.findAll();
        return all;
    }

    @RequestMapping (method = RequestMethod.POST)
    public Proposal save (@RequestBody Proposal proposal){
        Proposal p = proposalRepository.save(proposal);
        return p;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Proposal update (@RequestBody Proposal proposal){
        Proposal p = proposalRepository.save(proposal);
        return p;
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void delete (@RequestBody Proposal proposal){
        proposalRepository.deleteById(proposal.getId());
    }
}
