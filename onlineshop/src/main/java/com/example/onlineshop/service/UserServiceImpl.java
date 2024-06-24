package com.example.onlineshop.service;

import com.example.onlineshop.dto.UserCreateDto;
import com.example.onlineshop.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private Map<String, UserEntity> inMemoryRepository = new HashMap<>();

    @Override
    public List<UserEntity> getAll() {
        return inMemoryRepository.values().stream().toList();
    }

    @Override
    public UserEntity create(UserEntity userEntity) {
        userEntity.setId(new Random().nextLong());
        inMemoryRepository.put(userEntity.getName(), userEntity);
        return userEntity;
    }
    @Override
    public UserEntity edit(long id, UserCreateDto userCreateDto) {
        return new UserEntity(id, userCreateDto.getName(), userCreateDto.getEmail(),
                userCreateDto.getPhone(),
                userCreateDto.getPassword());
    }
    @Override
    public UserEntity getByLogin(String login) {
        return inMemoryRepository.get(login);
    }
}
