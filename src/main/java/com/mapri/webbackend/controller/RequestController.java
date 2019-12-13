package com.mapri.webbackend.controller;

import com.mapri.webbackend.domain.Request;
import com.mapri.webbackend.repository.RequestRepository;
import com.mapri.webbackend.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("request")
public class RequestController {
    @Autowired
    RequestRepository requestRepository;

    @Autowired
    RequestService requestService;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Request> findAll (){
        Iterable<Request> all = requestRepository.findAll();
        return all;
    }

    @RequestMapping(value = "{from}/{to}" ,method = RequestMethod.GET)
    public Iterable<Request> findFromTo (@PathVariable int from, @PathVariable int to){
        return requestService.getRequest(from-1, to);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Request save (@RequestBody Request request){
        Request r = requestService.save(request);
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
