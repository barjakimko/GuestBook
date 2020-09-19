package com.example.servingwebcontent;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public static Integer i=0;
    public String getGreetings(){

        i++;

        return i +"";
    }
}
