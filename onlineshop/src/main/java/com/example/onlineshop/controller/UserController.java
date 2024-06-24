package com.example.onlineshop.controller;

import com.example.onlineshop.dto.UserCreateDto;
import com.example.onlineshop.mapper.Mapper;
import jakarta.validation.Valid;
import com.example.onlineshop.dto.UserDto;
import com.example.onlineshop.entity.UserEntity;
import com.example.onlineshop.mapper.UserMapper;
import com.example.onlineshop.security.AuthService;
import com.example.onlineshop.security.model.JwtAuthResponce;
import com.example.onlineshop.security.model.SignInRequest;
import com.example.onlineshop.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/users")
@Slf4j
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private final UserMapper userMapper;
    private final AuthService authService;
    private final Mapper<UserEntity, UserDto> mapper;

    @GetMapping
    public ResponseEntity<List<UserDto>> listAll() {
        log.debug("Fetching all users");
        List<UserDto> userDto = userService.getAll()
                .stream()
                .map(user -> mapper.toDto(user))
                .collect(Collectors.toList());
        return ResponseEntity.ok(userDto);
    }

    @PostMapping("/register")
    public ResponseEntity<UserDto> register(@Valid @RequestBody UserCreateDto userCreateDto){
        UserEntity userEntity = userMapper.userCreateDtoToEntity(userCreateDto);
        UserEntity createdUserEntity = userService.create(userEntity);
        UserDto createdUserDto = userMapper.toDto(createdUserEntity);
        log.debug("User registered with Id: {}", createdUserDto.getId());
        return new ResponseEntity<>(createdUserDto, HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<UserDto> edit(@PathVariable Long id, @Valid @RequestBody UserCreateDto userCreateDto){
        log.debug("Attempting to edit user with Id: {}", id);
        UserEntity updatedUser = userService.edit(id, userCreateDto);
        return ResponseEntity.ok(userMapper.toDto(updatedUser));
    }




    @PostMapping("/login")
    public JwtAuthResponce login(@RequestBody SignInRequest request){
        return authService.authenticate(request);
    }
}