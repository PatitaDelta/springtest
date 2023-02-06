package com.gll.api.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gll.api.models.UserModel;
import com.gll.api.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping()
    public ArrayList<UserModel> getUsers(){
        return userService.getUsers();
    }
    
    @GetMapping(path = "/{id}")
    public Optional<UserModel> getAllById(@PathVariable("type") Long id){
        return userService.getById(id);
    }

    @GetMapping(path = "/{type}")
    public Optional<UserModel> getAllByType(@PathVariable("type") String type){
        return userService.getAllByType(type);
    }

    @PostMapping()
    public UserModel postUser(@RequestBody UserModel user){
        return userService.postUsers(user);
    }

}
