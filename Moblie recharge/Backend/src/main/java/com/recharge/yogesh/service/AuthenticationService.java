package com.recharge.yogesh.service;

import com.recharge.yogesh.dto.request.LoginRequest;
import com.recharge.yogesh.dto.request.RegisterRequest;
import com.recharge.yogesh.dto.response.LoginResponse;
import com.recharge.yogesh.dto.response.RegisterResponse;

public interface AuthenticationService {

    RegisterResponse register (RegisterRequest request);

    LoginResponse login(LoginRequest request);

}
