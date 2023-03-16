package com.jpasample.repository;

import com.jpasample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.EntityManager;

public interface UserRepository extends JpaRepository<User, Long> {

}
