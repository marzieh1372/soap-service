package com.example.soapservice.client;

import com.example.soapservice.client.gen.User;
import com.example.soapservice.client.gen.UserService;
import com.example.soapservice.client.gen.UserServiceWS;
import com.example.soapservice.soap.BadRequestException;


import java.util.List;

public class SoapClient {


    public static void main(String[] args) {
        // Create the service client
        UserServiceWS service = new UserServiceWS();
        UserService userService = service.getUserServicePort();

        // Add a new user
        User user1 = new User();
        user1.setFirstName("John");
        user1.setLastName("Doe");
        try {
            userService.addUser(user1);
            System.out.println("User added: " + user1.getFirstName() + " " + user1.getLastName());
        } catch (BadRequestException e) {
            System.out.println("Error adding user: " + e.getMessage());
        }

        // Add another user
        User user2 = new User();
        user2.setFirstName("Jane");
        user2.setLastName("Smith");
        try {
            userService.addUser(user2);
            System.out.println("User added: " + user2.getFirstName() + " " + user2.getLastName());
        } catch (BadRequestException e) {
            System.out.println("Error adding user: " + e.getMessage());
        }

        // Get all users
        List<User> users = userService.getUsers();
        System.out.println("All users:");
        for (User u : users) {
            System.out.println(u.getFirstName() + " " + u.getLastName());
        }

        // Remove a user
        try {
            userService.removeUser(user1);
            System.out.println("User removed: " + user1.getFirstName() + " " + user1.getLastName());
        } catch (BadRequestException e) {
            System.out.println("Error removing user: " + e.getMessage());
        }
    }
}


