package com.enterprise.codingService;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CodingController{
    private static Logger log = LoggerFactory.getLogger(CodingController.class);

    @GetMapping(value="users/{id}/repos")
    @ResponseBody public List<String> getRepositories(@PathVariable(value="id") String id){
        log.error("called with " + id);
        return new ArrayList<>();
    }
}