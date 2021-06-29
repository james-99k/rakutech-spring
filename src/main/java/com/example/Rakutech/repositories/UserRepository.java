package com.example.rakutech.repositories;

import com.example.rakutech.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
