package com.example.soapservice.soap;




import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;

@WebService(serviceName = "userServiceWS")
public class UserService {
    private ArrayList<User> userList = new ArrayList<>();

    @WebMethod
    public void addUser(User user) {
        validateUser(user);
        userList.add(user);
    }

    @WebMethod
    public void removeUser(User user) {
        validateUser(user);
        userList.remove(user);
    }

    @WebMethod
    public ArrayList<User> getUsers() {
        return userList;
    }

    private void validateUser(User user) {
        if(user==null){
            throw new BadRequestException("user not send");
        }
        if(user.getFirstName()==null){
            throw new BadRequestException("user firstName is empty");
        }
        if(user.getLastName()==null){
            throw new BadRequestException("user lastName is empty");
        }
    }
}