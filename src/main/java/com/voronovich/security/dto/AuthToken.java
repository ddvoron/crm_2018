package com.voronovich.security.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AuthToken {

    private String token;

    public AuthToken(String token){
        this.token = token;
    }
}