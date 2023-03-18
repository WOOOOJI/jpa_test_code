package com.jpasample.service;

import com.jpasample.entity.User;
import static org.assertj.core.api.Assertions.*;

import com.jpasample.repository.UserRepository;
import lombok.Builder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {

    @Autowired
    UserService userService;
    @Test
    void join() {
        User user = User.builder().id(2L).name("woojin").build();
        assertThat(userService.join(user)).isEqualTo(2L);
    }


    @Test
    void findUsers() {
    }

    @Test
    void findOne() {
    }


    @Test
    public void test(){

    }

}