package com.example.rakutech.services;

import com.example.rakutech.dto.UserRegistrationDto;
import com.example.rakutech.models.User;

public interface UserServices {
    User save(UserRegistrationDto registrationDto);
}
