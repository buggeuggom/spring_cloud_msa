package com.ecomerce.userservice.service;

import com.ecomerce.userservice.controller.request.RequestUser;
import com.ecomerce.userservice.dto.UserDto;

public interface UserService {

    UserDto createUser(RequestUser request);
}
