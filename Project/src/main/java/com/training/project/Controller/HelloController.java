package com.training.project.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.training.project.jdbc.Person;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/rest")
    public Person hello(
            @RequestParam(required =false,defaultValue = "firstname") String firstName,
            @RequestParam(required =false,defaultValue = "firstname") String lastName,
            Model model){

        return new Person(1,firstName,lastName);

    }
}
