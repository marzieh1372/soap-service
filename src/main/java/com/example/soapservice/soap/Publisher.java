package com.example.soapservice.soap;

import jakarta.xml.ws.Endpoint;

public class Publisher {
    public static void main(String[] args) {
        String url = "http://localhost:8082/";
        Endpoint.publish(url, new UserService());
        System.out.println("Service published at: " + url);
    }
}