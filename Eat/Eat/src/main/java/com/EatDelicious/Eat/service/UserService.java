package com.EatDelicious.Eat.service;

import com.EatDelicious.Eat.io.UserRequest;
import com.EatDelicious.Eat.io.UserResponse;

public interface UserService {

    UserResponse registerUser(UserRequest request);

    String findByUserId();
}
