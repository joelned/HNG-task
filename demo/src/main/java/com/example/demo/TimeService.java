package com.example.demo;

import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class TimeService {

    public String getCurrentTime(){
        Instant instant = Instant.now();
        return instant.toString();
    }
}
