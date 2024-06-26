package com.example.onlineshop.security;

import com.example.onlineshop.security.model.JwtAuthResponce;
import com.example.onlineshop.security.model.SignInRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class AuthServiceImpl implements AuthService {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private JwtService jwtService;
    @Override
    public JwtAuthResponce authenticate(SignInRequest request) {
        try{
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getLogin(), request.getPassword()));
        UserDetails user = userDetailsService.loadUserByUsername(request.getLogin()
        );
        String token = jwtService.generateToken(user);
        return new JwtAuthResponce(token);
    }catch (AuthenticationException authenticationException){
        log.error("Ошибка аутентификации для пользователя: {} Ошибка: {}", request.getLogin(),
                authenticationException.getMessage());
        throw new AuthenticationServiceException("Ошибка аутентификации: " + authenticationException.getMessage());
        }
    }
}
