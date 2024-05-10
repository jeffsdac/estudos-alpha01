package br.com.jeff.alpha01.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.jeff.alpha01.Models.User;
import br.com.jeff.alpha01.Service.UserService;

@RestController
@CrossOrigin("*")
public class UserController {

    

    @Autowired
    UserService service;


    @GetMapping("/users")
    public List<User> getAllUsers(){
        return service.getAllUsers();
    }

    @PostMapping("/users")
    public void addUser(@RequestBody User u){
        service.addUser(u);
    }

    @DeleteMapping("/users/{id}")
    public void removeUser(@PathVariable int id){
        service.removeUser(id);
    }

    @GetMapping("/users/{id}")
    public User getById(@PathVariable int id){
        return service.getById(id);
    }

    @PutMapping("/users/{id}")
    public void updateUser(@PathVariable int id, @RequestBody User u){
        User uGet = service.getById(id);
        uGet.setEmail(u.getEmail());
        uGet.setPassword(u.getPassword());

        service.addUser(uGet);
    }
    
}
