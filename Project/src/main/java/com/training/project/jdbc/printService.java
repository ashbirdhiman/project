package com.training.project.jdbc;

import com.training.project.Controller.ValueController;
import org.springframework.messaging.Message;

import java.util.ArrayList;
import java.util.List;

public class printService {
    public void print(Message<String> message) {
        System.out.println("Console laptop" + message);


    }
}