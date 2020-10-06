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
       
       if (user.equals(this.abe) || user.equals(this.barb)) {
           return user;
       }
       
       return null;
    }
}
