package com.example.onlineshop.service;

import com.example.onlineshop.dto.UserCreateDto;
import com.example.onlineshop.entity.UserEntity;

import java.util.List;

public interface UserService {
    List<UserEntity> getAll();
    UserEntity create(UserEntity userEntity);
    UserEntity getByLogin(String login);

    UserEntity edit(long id, UserCreateDto  userCreateDto);
}
