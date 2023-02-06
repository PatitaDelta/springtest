package com.gll.api.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gll.api.models.UserModel;
import com.gll.api.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping()
    public ArrayList<UserModel> getUsers() {
        return userService.getUsers();
    }

    @GetMapping(path = "/{id}")
    public Optional<UserModel> getAllById(@PathVariable("type") Long id) {
        return userService.getById(id);
    }

    @GetMapping(path = "/query")
    public Optional<UserModel> getAllByType(@RequestParam("type") String type) {
        return userService.getAllByType(type);
    }

    @PostMapping()
    public UserModel postUser(@RequestBody UserModel user) {
        return userService.postUsers(user);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable Long id) {
        if (userService.deleteUserById(id)) {
            return "El usuario con el id: " + id + "se ha eliminado correctamente";
        } else {
            return "No se pudo borrar el usuario con el id: " + id;
        }

    }

}
