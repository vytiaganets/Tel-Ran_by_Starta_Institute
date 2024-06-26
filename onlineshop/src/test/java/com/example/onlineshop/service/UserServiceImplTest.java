package com.example.onlineshop.service;

import com.example.onlineshop.dto.UserCreateDto;
import com.example.onlineshop.entity.UserEntity;
import com.example.onlineshop.mapper.UserMapper;
import com.example.onlineshop.repository.UserJpaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceImplTest {
    @Mock
    private UserJpaRepository userJpaRepository;
    @Mock
    private UserMapper userMapper;
    @InjectMocks
    private UserServiceImpl userServiceImpl;
    private UserEntity userEntity;
    private UserCreateDto userCreateDto;
    @BeforeEach
    void setUp(){
        userEntity = new  UserEntity();
        userEntity.setId(1L);
        userEntity.setName("Andrii");
        userEntity.setEmail("andrii@ukr.net");
        userEntity.setPassword("password");

        userCreateDto = new UserCreateDto();
        userCreateDto.setName("Andrii");
        userCreateDto.setEmail("andrii@uk.net");
        userCreateDto.setPassword("password");
    }
    @Test
    void create(){
        when(userMapper.userCreateDtoToEntity(any(UserCreateDto.class))).thenReturn(userEntity);
        when(userJpaRepository.save(any(UserEntity.class))).thenReturn(userEntity);

        UserEntity createdUser = userServiceImpl.create(userEntity);

        assertThat(createdUser).isNotNull();
        assertThat(createdUser.getName()).isEqualTo(userCreateDto.getName());
        verify(userJpaRepository).save(any(UserEntity.class));
    }
}
