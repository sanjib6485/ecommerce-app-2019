package com.sanjib.repository;

import org.springframework.data.repository.CrudRepository;

import com.sanjib.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

	User findByFirstName(String firstName);

	User findByLastName(String lastName);

	User findByMiddleName(String middleName);

	User findByEmail(String email);
}
