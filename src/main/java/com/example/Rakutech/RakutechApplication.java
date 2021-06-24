package com.example.rakutech;

//import com.example.rakutech.models.User;
//import com.example.rakutech.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RakutechApplication {

	public static void main(String[] args) {
		SpringApplication.run(RakutechApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

//	@Autowired
//	private UserRepository userRepository;

//	@Override
//	public void run(String... args) throws Exception {
//		this.userRepository.save(new User("Test", "One", "test1@gmail.com"));
//		this.userRepository.save(new User("Test", "Two", "test2@gmail.com"));
//		this.userRepository.save(new User("Test", "Three", "test3@gmail.com"));
//	}
}
