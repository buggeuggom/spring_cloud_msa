package com.ecomerce.userservice.controller.request;

import lombok.Data;

@Data
public class RequestUser {

    private String email;
    private String pwd;
    private String name;
}
