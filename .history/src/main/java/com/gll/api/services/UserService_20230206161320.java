package com.gll.api.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gll.api.models.UserModel;
import com.gll.api.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public ArrayList<UserModel> getUsers(){
        return (ArrayList<UserModel>)userRepository.findAll();
    }

    public Optional<UserModel> getById(Long id){
        return userRepository.findById(id);
    }

    public Optional<UserModel> getAllByType(String type) {
        return userRepository.findAllByType(type);
    }

    public UserModel postUsers(UserModel user){
        return userRepository.save(user);
    }

    public boolean deleteUserById(Long id){
        try {
            userRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
