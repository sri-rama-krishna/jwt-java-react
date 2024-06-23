package com.jwtjava.jwtjava.service;

import com.jwtjava.jwtjava.dto.LoginDto;
import com.jwtjava.jwtjava.dto.RegisterDto;

public interface AuthService {
    String register(RegisterDto registerDto);

    String login(LoginDto loginDto);
}