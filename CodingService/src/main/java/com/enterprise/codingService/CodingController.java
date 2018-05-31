package com.enterprise.codingService;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CodingController{
    private static Logger log = LoggerFactory.getLogger(CodingController.class);

    @Autowired
    public AppConfiguration configuration;

    @GetMapping(value="users/{id}/repos")
    @ResponseBody public List<String> getRepositories(@PathVariable(value="id") String id){
        log.error("called with " + id  + configuration.getWorld());
        return new ArrayList<>();
    }
}