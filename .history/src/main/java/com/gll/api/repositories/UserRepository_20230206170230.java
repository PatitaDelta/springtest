package com.gll.api.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.gll.api.models.UserModel;

public interface UserRepository extends CrudRepository<UserModel, Long>{
    public abstract Optional<UserModel> findAllByType(String type);
}
