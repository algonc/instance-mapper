package com.example.instance.mapper.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class DefaultController {

    private static final String INSTANCE_ID = UUID.randomUUID().toString();

    @Value("${instance.message}")
    private String instanceMessage;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String welcome() {
        return String.format(instanceMessage, INSTANCE_ID);
    }

}