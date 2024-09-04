package com.apirest.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apirest.userdept.entites.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
