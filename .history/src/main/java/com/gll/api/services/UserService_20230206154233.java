package com.gll.api.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gll.api.models.UserModel;
import com.gll.api.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public ArrayList<UserModel> obtenerUsuarios(){
        return (ArrayList<UserModel>)userRepository.findAll();
    }
}
