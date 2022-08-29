package com.example.lab2;

import org.springframework.web.bind.annotation.*;

@RestController
public class MathService {
    @RequestMapping( value = "/add/{numa}/{numb}", method = RequestMethod.GET)
    public double add(@PathVariable("numa") int numa,
                      @PathVariable("numb") int numb) {
        return  numa + numb;
    }

    @RequestMapping( value = "/minus/{numa}/{numb}", method = RequestMethod.GET)
    public double minus(@PathVariable("numa") int numa,
                        @PathVariable("numb") int numb) {
        return  numa - numb;
    }

    @RequestMapping( value = "/multiply", method = RequestMethod.GET)
    public double multiply(@RequestParam("numa") int numa,
                           @RequestParam("numb") int numb) {
        return  numa * numb;
    }

    @RequestMapping( value = "/divide", method = RequestMethod.GET)
    public double divide(@RequestParam("numa") double numa,
                         @RequestParam("numb") double numb) {
        return  numa / numb;
    }
}