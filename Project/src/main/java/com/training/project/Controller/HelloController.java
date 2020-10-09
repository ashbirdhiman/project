package com.training.project.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.training.project.jdbc.Person;
import com.training.project.jdbc.personGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private personGateway gateway;
    @GetMapping("/rest")
    public Person hello(
            @RequestParam(required =false,defaultValue = "firstname") String firstName,
            @RequestParam(required =false,defaultValue = "firstname") String lastName,
            @RequestParam(required =false,defaultValue = "0") String id
            ){
        Person s=new Person(Integer.parseInt(id),firstName,lastName);

this.gateway.save(s);

        return s;

    }
}
