package com.oxygen.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class LoginDto {

    private String username;
    private String password;
}
