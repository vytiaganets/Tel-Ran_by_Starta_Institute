package com.example.onlineshop.security;

import com.example.onlineshop.entity.UserEntity;
import com.example.onlineshop.service.UserService;
import com.example.onlineshop.exceptions.UserNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private final UserService userService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = userService.getByLogin(username);
        return new org.springframework.security.core.userdetails.User(userEntity.getName(), userEntity.getPassword(),
                List.of(new SimpleGrantedAuthority(userEntity.getRole())));
    }
}
