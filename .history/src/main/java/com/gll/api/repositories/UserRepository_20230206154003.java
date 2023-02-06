package com.gll.api.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gll.api.models.UserModel;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long>{

}
