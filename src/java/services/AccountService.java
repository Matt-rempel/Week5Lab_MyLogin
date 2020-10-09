/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import models.User;

/**
 *
 * @author 584893
 */
public class AccountService {
    User abe;
    User barb;

    public AccountService() {
        this.barb = new User("barb", "password");
        this.abe = new User("abe", "password");
    }
    
    public User login(String username, String password) {
       User user = new User(username, password);
       
       if ((this.barb.getUsername().equals(user.getUsername()) || this.abe.getUsername().equals(user.getUsername())) && password.equals("password")) {
           user.setPassNull();
           return user;
       }
       
       return null;
    }
   
}
