package com.enterprise.codingService;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CodingController{

    @GetMapping(value="users/{id}/repos")
    @ResponseBody public List<String> getRepositories(@PathVariable(value="id") String id){
        return new ArrayList<>();
    }
}