package com.example.lab2;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class GeneratePasswordService {
    @RequestMapping( value = "/{name}.generate", method = RequestMethod.GET)
    public String helloworld(@PathVariable("name") String name) {
        Random rand = new Random();
        int upperbound = 99999999;
        return "hi, " + name + "\n" + "Your new password is " + rand.nextInt(upperbound);
    }
}