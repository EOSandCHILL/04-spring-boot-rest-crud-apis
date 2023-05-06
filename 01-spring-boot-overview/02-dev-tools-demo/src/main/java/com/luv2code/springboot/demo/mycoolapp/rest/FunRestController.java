package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello() {
        return "Hello, my name is Jerry!";
    }

    //expose a new endpoint for "workout"

    @GetMapping("/workout")
    public String workout() {
        return "Time to workout, Jerry!!!";
    }

    //expose a new endpoint for "dinner"

    @GetMapping("/dinner")
    public String dinner() {
        return "Time to eat!!!";
    }
}
