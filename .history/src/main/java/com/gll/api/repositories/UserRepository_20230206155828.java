package com.gll.api.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gll.api.models.UserModel;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long>{
    public abstract ArrayList<UserModel> findByType(String type);
}
