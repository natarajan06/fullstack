package com.recharge.yogesh.service.impl;

import java.util.Optional;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.recharge.yogesh.dto.request.LoginRequest;
import com.recharge.yogesh.dto.request.RegisterRequest;
import com.recharge.yogesh.dto.response.LoginResponse;
import com.recharge.yogesh.dto.response.RegisterResponse;
import com.recharge.yogesh.enumerated.Role;
import com.recharge.yogesh.model.User;
import com.recharge.yogesh.repository.UserRepository;
import com.recharge.yogesh.service.AuthenticationService;
import com.recharge.yogesh.utils.jwtUtils;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@SuppressWarnings("null")
public class AuthenticationServiceimpl implements AuthenticationService {


    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final jwtUtils jwtUtil;




    @Override
    public RegisterResponse register(RegisterRequest request){
        Optional<User> isUserExists = userRepository.findByEmail(request.getEmail());
        if(isUserExists.isPresent()){
            return RegisterResponse.builder().message("User with mail id "+ request.getEmail()+" is already exists!").build();
        }
           
    var user =User.builder()
        .name(request.getName())
        .email(request.getEmail())
        .pwd(passwordEncoder.encode(request.getPassword()))
        .role(Role.USER)
        .build();
    userRepository.save(user);
    return RegisterResponse.builder().message("User created successfully!").build();
    }

    @Override
    public LoginResponse login(LoginRequest request) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));
        var user = userRepository.findByEmail(request.getEmail()).orElseThrow();
        String token = jwtUtil.generateToken(user);
        return LoginResponse.builder().message("User logged in successfully!")
                                        .token(token)
                                        .build();
       
    }

    
}
