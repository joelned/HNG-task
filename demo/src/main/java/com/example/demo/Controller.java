package com.example.demo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {

    private final Model model;
    private final TimeService timeService;

    public Controller(Model model, TimeService timeService) {
        this.model = model;
        this.timeService = timeService;
    }

    @GetMapping
    public ResponseEntity<Map<String, String>>getDetails(){
        Map<String, String> response = new HashMap<>();
        model.setEmail("joelekwegh3@gmail.com");
        model.setUrl("https://github.com/joelned/HNG-task");
        String time = timeService.getCurrentTime();
        response.put("email", model.getEmail());
        response.put("time", time);
        response.put("url", model.getUrl());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
