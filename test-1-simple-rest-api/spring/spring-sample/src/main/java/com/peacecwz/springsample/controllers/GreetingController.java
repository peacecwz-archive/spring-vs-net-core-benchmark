package com.peacecwz.springsample.controllers;

import com.peacecwz.springsample.models.GreetingModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong ounter = new AtomicLong();

    @RequestMapping(value = "/greeting")
    public GreetingModel getGreetings(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new GreetingModel(ounter.incrementAndGet(), String.format(template, name));
    }
}
