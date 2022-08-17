package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @CrossOrigin
    @GetMapping("/temp")
    public Temperature temp(@RequestParam(value = "id", defaultValue = "0") String id,
                            @RequestParam(value = "value", defaultValue = "0") String value) {

        return new Temperature(Integer.parseInt(id), Float.parseFloat(value));
    }

}
