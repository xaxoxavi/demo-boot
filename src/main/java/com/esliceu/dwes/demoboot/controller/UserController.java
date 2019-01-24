package com.esliceu.dwes.demoboot.controller;

import com.esliceu.dwes.demoboot.component.GenericRepository;
import com.esliceu.dwes.demoboot.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
public class UserController {

    @Autowired
    private GenericRepository<String,User> userRepository;

    @RequestMapping("/users")
    public Set<User> getAll(){
        return userRepository.getAll();
    }

    @RequestMapping(value = "/users",method = RequestMethod.POST)
    public ResponseEntity<User> addUser( @RequestBody User user){

        userRepository.addItem(user);
         return new ResponseEntity<>(user,HttpStatus.CREATED);
    }


    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    public ResponseEntity removeUser(@PathVariable("id") String id){

        userRepository.remove(id);
        return new ResponseEntity(HttpStatus.OK);
    }


    @RequestMapping(value = "/users/{id}")
    public User getUser(@PathVariable("id") String id){
        return userRepository.getItem(id);
    }

}
