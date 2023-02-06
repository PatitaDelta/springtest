package com.gll.api.repositories;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gll.api.models.UserModel;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long>{
    public abstract ArrayList<UserModel> findAllByType(String type);
}
