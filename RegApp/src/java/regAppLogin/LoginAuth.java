/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regAppLogin;

import java.util.HashMap;
import regAppLogin.dto.User;

/**
 *
 * @author oluwatosin
 */
public class LoginAuth {
    HashMap<String, String> hashmapUsers = new HashMap<>();
    public LoginAuth(){
        hashmapUsers.put("s.jeg", "Serere Jegede");
        hashmapUsers.put("p.jeg", "Praise Jegede");
        hashmapUsers.put("t.jeg", "Tosin Jegede");
    }
    
    public boolean authenticate(String userName, String password){
        if(password == null || password == ""){
            return false;
        }
        return true;
    }
    
    public User getUser(String name){
        User user = new User();
        user.setName(hashmapUsers.get(name));
        return user;
        
    }
}
