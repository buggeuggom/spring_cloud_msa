package com.ecomerce.userservice.controller.response;


import com.ecomerce.userservice.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class ResponseUser {
    private String name;
    private String email;

    public ResponseUser(UserDto dto) {
        this.name = dto.getName();
        this.email = dto.getEmail();
    }
}
