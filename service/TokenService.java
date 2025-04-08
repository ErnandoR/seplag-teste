package com.example.testepratico.service;

import com.example.testepratico.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenService {

    @Autowired
    private JwtUtil jwtUtil;

    public String refreshToken(String oldToken) {
        if (jwtUtil.validateToken(oldToken)) {
            String username = jwtUtil.extractUsername(oldToken);
            return jwtUtil.generateToken(username);
        }
        throw new RuntimeException("Token inválido ou expirado.");
    }
}
