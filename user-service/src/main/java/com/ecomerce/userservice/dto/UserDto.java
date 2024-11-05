package com.ecomerce.userservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.Date;

import static lombok.AccessLevel.*;

@Getter
@Builder
@AllArgsConstructor(access = PRIVATE)
public class UserDto {

    private String email;
    private String pwd;
    private String name;
    private Date createdAt;
}
