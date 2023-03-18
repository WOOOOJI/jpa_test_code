package com.jpasample.service;

import com.jpasample.entity.User;
import com.jpasample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    public Long join(User user){
        userRepository.save(user);
        return user.getId();
    }

    private void vaildDateDuplicateUser(User user) {
        userRepository.findById(user.getId());

    }

    public List<User> findUsers(){
        return userRepository.findAll();
    }

    public Optional<User> findOne(Long id){
        return userRepository.findById(id);
    }


}
