package com.recharge.yogesh.controller;

import static com.recharge.yogesh.utils.MyConstant.USER;
import static com.recharge.yogesh.utils.MyConstant.USERLIST;
import static org.springframework.http.HttpStatus.EXPECTATION_FAILED;
import static org.springframework.http.HttpStatus.OK;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recharge.yogesh.dto.response.BasicResponse;
import com.recharge.yogesh.dto.response.UserResponse;
import com.recharge.yogesh.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController

@RequestMapping(USER)
@RequiredArgsConstructor
public class UserController {


        private final UserService userService;

    @GetMapping(USERLIST)
    public ResponseEntity<BasicResponse<UserResponse>> getAllUser(){
        BasicResponse<UserResponse> response=new BasicResponse<>();
        try{
            response=userService.getAllUser();
            return new ResponseEntity<>(response,OK);

        }
        catch(Exception e){
            response.setMessage("Something went wrong!");
            return new ResponseEntity<>(response,EXPECTATION_FAILED);
        }
    }
    
}
