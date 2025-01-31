package com.example.demo;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

@Service
public class TimeService {

    public String getCurrentTime(){
        Instant instant = Instant.now();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_INSTANT.withZone(ZoneOffset.UTC);
        String formattedDateTime = formatter.format(instant);
        return formattedDateTime.toString();
    }
}
