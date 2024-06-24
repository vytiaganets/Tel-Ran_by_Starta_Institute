package com.example.onlineshop.mapper;

import com.example.onlineshop.dto.UserCreateDto;
import com.example.onlineshop.dto.UserDto;
import com.example.onlineshop.entity.UserEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    private PasswordEncoder passwordEncoder;

    public UserDto toDto(UserEntity userEntity) {
        return new UserDto(userEntity.getName(), userEntity.getEmail(), userEntity.getPhone(),
                userEntity.getPassword());
    }


    public UserEntity toEntity(UserDto userDto) {
        return new UserEntity(userDto.getName(), userDto.getEmail(), userDto.getPhone(),
                passwordEncoder.encode(userDto.getPassword()));
    }


    public UserEntity userCreateDtoToEntity(UserCreateDto userCreateDto){
        return new UserEntity(userCreateDto.getName(), userCreateDto.getEmail(), userCreateDto.getPhone(),
                userCreateDto.getPassword());
    }
}
