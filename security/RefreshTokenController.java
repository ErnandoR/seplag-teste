package com.example.testepratico.security;

import com.example.testepratico.service.TokenService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class RefreshTokenController {

    @Autowired
    private TokenService tokenService;

    @PostMapping("/refresh")
    public String refreshToken(HttpServletRequest request, HttpServletResponse response) {
        String token = request.getHeader("Authorization");
        if (token != null && token.startsWith("Bearer ")) {
            token = token.substring(7);
            return tokenService.refreshToken(token);
        }
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        return "Token inválido.";
    }
}
