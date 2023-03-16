package com.jpasample;

import com.jpasample.entity.User;
import com.jpasample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class DirtyChecking {

    @Autowired
    UserRepository userRepository;

    @Transactional
    public void updateUser(Long id, String name){
        Optional<User> user = userRepository.findById(id);
        user.ifPresent(value -> value.setName(name));
    }

}
