package com.jpasample.repository;

import com.jpasample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u.id FROM User u WHERE u.id = :id")
    Optional<User> findByCustomeId(@Param("id") Long id);

    @Transactional
    @Modifying
    @Query("update User u set u.name = :name where u.id = :id")
    void updateName(@Param("id") Long id , @Param("name") String name);
}
