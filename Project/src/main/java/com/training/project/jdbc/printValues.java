package com.training.project.jdbc;

import org.springframework.messaging.Message;

import java.util.ArrayList;
import java.util.List;

public class printValues {
    public void values(Message<String>message){
        List<String> list=new ArrayList<>();
        list.add(message.getPayload());

        for(String s:list){
            System.out.println(s);
        }
    }

}

