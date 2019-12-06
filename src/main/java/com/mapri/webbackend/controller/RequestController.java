package com.mapri.webbackend.controller;

import com.mapri.webbackend.domain.Request;
import com.mapri.webbackend.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("request")
public class RequestController {
    @Autowired
    RequestRepository requestRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Request> findAll (){
        Iterable<Request> all = requestRepository.findAll();
        return all;
    }

    @RequestMapping(method = RequestMethod.POST)
    public Request save (@RequestBody Request request){
        Request r = requestRepository.save(request);
        return r;
    }

    @RequestMapping (method = RequestMethod.PUT)
    public Request update (@RequestBody Request request){
        Request r = requestRepository.save(request);
        return r;
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void delete (@RequestBody Request request){
        requestRepository.deleteById(request.getId());
    }
}
