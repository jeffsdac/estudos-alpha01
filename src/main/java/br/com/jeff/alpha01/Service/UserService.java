package br.com.jeff.alpha01.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.jeff.alpha01.Models.User;

@Component
public class UserService {
    
    @Autowired
    UserDB db;


    public List<User> getAllUsers(){
        return db.findAll();
    }

    public void addUser(User u){
        db.save(u);
    }

    public void removeUser(int id){
        db.deleteById(id);
    }
    
    public User getById(int id){
        return db.findById(id).get();
    }
}
