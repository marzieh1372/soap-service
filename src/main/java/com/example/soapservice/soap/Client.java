package com.example.soapservice.soap;

import jakarta.xml.ws.*;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Client {
    public static void main(String[] args) throws MalformedURLException {
        String serviceUrl = "http://localhost:8082/userServiceWS?wsdl";
        QName serviceName = new QName("http://localhost:8082/", "UserService");

        Service service = Service.create(new URL(serviceUrl),serviceName);
        UserService userService = service.getPort(UserService.class);

        // Add a new user
        User newUser = new User();
        newUser.setFirstName("John");
        newUser.setLastName("Doe");
        userService.addUser(newUser);

        // Remove a user
        User userToRemove = new User();
        userToRemove.setFirstName("John");
        userToRemove.setLastName("Doe");
        userService.removeUser(userToRemove);

        // Get the list of users
        List<User> userList = userService.getUsers();
        for (User user : userList) {
            System.out.println(user.getFirstName() + " " + user.getLastName());
        }
    }
}