package com.example.demo;


import org.springframework.stereotype.Component;

@Component
public class Model {
    private String email;
    private String url;


    public String getEmail(){
        return email;
    }

    public String getUrl(){
        return url;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setUrl(String url){
        this.url = url;
    }
}
