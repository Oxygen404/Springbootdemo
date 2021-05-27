package com.oxygen.dto;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class RegisterDto {

    private String nickname;
    private String username;
    private String password;
    private String secondPassword;
}
