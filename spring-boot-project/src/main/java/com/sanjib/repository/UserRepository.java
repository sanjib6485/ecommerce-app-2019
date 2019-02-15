package com.sanjib.repository;

import org.springframework.data.repository.CrudRepository;

import com.sanjib.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
