
package com.example.soapservice.client.gen;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UserService", targetNamespace = "http://soap.soapservice.example.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UserService {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addUser", targetNamespace = "http://soap.soapservice.example.com/", className = "com.example.soapservice.client.gen.AddUser")
    @ResponseWrapper(localName = "addUserResponse", targetNamespace = "http://soap.soapservice.example.com/", className = "com.example.soapservice.client.gen.AddUserResponse")
    @Action(input = "http://soap.soapservice.example.com/UserService/addUserRequest", output = "http://soap.soapservice.example.com/UserService/addUserResponse")
    public void addUser(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0);

    /**
     * 
     * @return
     *     returns java.util.List<com.example.soapservice.client.gen.User>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUsers", targetNamespace = "http://soap.soapservice.example.com/", className = "com.example.soapservice.client.gen.GetUsers")
    @ResponseWrapper(localName = "getUsersResponse", targetNamespace = "http://soap.soapservice.example.com/", className = "com.example.soapservice.client.gen.GetUsersResponse")
    @Action(input = "http://soap.soapservice.example.com/UserService/getUsersRequest", output = "http://soap.soapservice.example.com/UserService/getUsersResponse")
    public List<User> getUsers();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "removeUser", targetNamespace = "http://soap.soapservice.example.com/", className = "com.example.soapservice.client.gen.RemoveUser")
    @ResponseWrapper(localName = "removeUserResponse", targetNamespace = "http://soap.soapservice.example.com/", className = "com.example.soapservice.client.gen.RemoveUserResponse")
    @Action(input = "http://soap.soapservice.example.com/UserService/removeUserRequest", output = "http://soap.soapservice.example.com/UserService/removeUserResponse")
    public void removeUser(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0);

}
