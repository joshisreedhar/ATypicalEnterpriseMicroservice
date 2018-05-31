package com.enterprise.codingService;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Component
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "hello")
public class CodingController{
    private static Logger log = LoggerFactory.getLogger(CodingController.class);

    @Autowired
    public AppConfiguration configuration;

    @GetMapping(value="users/{id}/repos")
    @ResponseBody public List<String> getRepositories(@PathVariable(value="id") String id){
        log.error("called with " + id  + configuration.getWorld()[]);
        return new ArrayList<>();
    }
}