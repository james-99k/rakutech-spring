package com.example.Rakutech;

import com.example.Rakutech.model.User;
import com.example.Rakutech.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RakutechApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RakutechApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Test", "One", "test1@gmail.com"));
		this.userRepository.save(new User("Test", "Two", "test2@gmail.com"));
		this.userRepository.save(new User("Test", "Three", "test3@gmail.com"));
	}
}
