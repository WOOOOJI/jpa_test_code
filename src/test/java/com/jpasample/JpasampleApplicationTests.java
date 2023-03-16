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

	@Autowired
	DirtyChecking dirtyChecking;



	@Test
	void jpaSave() {
		for(long i = 0L; i<10; i++){
			User user = User.builder().name("Hi"+i).build();
			userRepository.save(user);
		}
	}

	void jpaFind(){
		long number = 3L;
		Optional<User> user = userRepository.findById(number);
		System.out.println(user.isPresent() ? user.get().toString() : "Nothing");
	}

	@Test
	void jpaDelete(){

		userRepository.delete(User.builder().name("Hi4").id(5L).build());
	}

	@Test
	void jpaDirtyChecking(){
		dirtyChecking.updateUser(2L, "바뀌는 값");
	}

	@Test
	void jpaMerge(){
		User user = User.builder().id(3L).name("병합하기").build();
		userRepository.save(user);
	}





}