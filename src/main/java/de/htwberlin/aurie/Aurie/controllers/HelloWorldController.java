package de.htwberlin.aurie.Aurie.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller


public class HelloWorldController {
    @GetMapping (value = "/")
    public String Index () {
        return "HelloWorld";
    }
    @GetMapping (value = "/hallo")
    public String hallo(){
        return "HelloWorld";
    }
}
