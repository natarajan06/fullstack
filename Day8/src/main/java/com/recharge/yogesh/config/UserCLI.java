package com.recharge.yogesh.config;

import static com.recharge.yogesh.enumerated.Role.ADMIN;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.recharge.yogesh.model.User;
import com.recharge.yogesh.repository.UserRepository;

import lombok.RequiredArgsConstructor;


@Component
@RequiredArgsConstructor
public class UserCLI implements CommandLineRunner {
    private final UserRepository userRepository;
     private final PasswordEncoder passwordEncoder;
    @Override
    public void run(String...args) throws Exception{
        if(userRepository.count()>0)
            return;


        var user =User.builder()
                .name("Admin")
                .email("admin@gmail.com")
                .pwd(passwordEncoder.encode("Admin@123"))
                .role(ADMIN)
                .build();
        userRepository.save(user);
    }
    
}
