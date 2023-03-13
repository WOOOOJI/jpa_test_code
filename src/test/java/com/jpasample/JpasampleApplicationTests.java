package com.jpasample;

import com.jpasample.entity.User;
import com.jpasample.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class JpasampleApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Test
	void jpaTest() {
		for(long i = 0L; i<10; i++){
			User user = User.builder().name("Hi"+i).build();
			userRepository.save(user);
		}

		Optional<User> user = userRepository.findById(3L);
		System.out.println(user.isPresent() ? user.get().toString() : "Nothing");
	}

}
