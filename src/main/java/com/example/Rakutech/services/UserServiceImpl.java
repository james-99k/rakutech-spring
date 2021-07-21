package com.example.rakutech.services;

import com.example.rakutech.dto.UserRegistrationDto;
import com.example.rakutech.models.User;
import com.example.rakutech.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserServices{

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDto registrationDto){
        User user = new User(registrationDto.getFullName(),
                registrationDto.getEmail(), registrationDto.getPassword());
        return userRepository.save(user);
    }
}
