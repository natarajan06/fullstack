package com.recharge.yogesh.service;

import com.recharge.yogesh.dto.response.BasicResponse;
import com.recharge.yogesh.dto.response.UserResponse;

public interface UserService {

    BasicResponse<UserResponse> getAllUser();

}
