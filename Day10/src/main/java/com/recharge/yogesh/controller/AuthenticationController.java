package com.recharge.yogesh.controller;

import static com.recharge.yogesh.utils.MyConstant.AUTH;
import static com.recharge.yogesh.utils.MyConstant.LOGIN;
import static com.recharge.yogesh.utils.MyConstant.REGISTER;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recharge.yogesh.dto.request.LoginRequest;
import com.recharge.yogesh.dto.request.RegisterRequest;
import com.recharge.yogesh.dto.response.LoginResponse;
import com.recharge.yogesh.dto.response.RegisterResponse;
import com.recharge.yogesh.service.AuthenticationService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(AUTH)
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping(REGISTER)
    public ResponseEntity<RegisterResponse> register (@RequestBody RegisterRequest request){
        RegisterResponse response = new RegisterResponse();
        try{
            response = authenticationService.register(request);
            return new ResponseEntity<>(response,HttpStatus.ACCEPTED);
        }
        catch(Exception e){
            response.setMessage("Something went wrong");
            return new ResponseEntity<>(response,HttpStatus.EXPECTATION_FAILED);
        }
    }

    @PostMapping(LOGIN)
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request){
        LoginResponse response = new LoginResponse();
        try{
            response = authenticationService.login(request);
            return new ResponseEntity<>(response,HttpStatus.ACCEPTED);

        }
        catch(Exception e){
            System.out.println(e);
            response.setMessage("Something went wrong!");
            response.setToken("");
            return new ResponseEntity<>(response,HttpStatus.EXPECTATION_FAILED);
        }
    }

    
}
