package com.example.onlineshop.controller;

import com.example.onlineshop.dto.CategoryCreateDto;
import com.example.onlineshop.dto.CategoryDto;
import com.example.onlineshop.entity.CategoryEntity;
import com.example.onlineshop.exceptions.CategoryInvalidArgumentException;
import com.example.onlineshop.exceptions.CategoryNotFoundException;
import com.example.onlineshop.mapper.CategoryMapper;
import com.example.onlineshop.service.CategoryServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/categories")
public class CategoryController {
    private final CategoryServiceImpl categoryService;
    private final CategoryMapper categoryMapper;

    @GetMapping
    public ResponseEntity<List<CategoryDto>> getAll() {
        List<CategoryDto> categoryDtoList = categoryService.getAll().stream()
                .map(categoryMapper::toDto)
                .collect(Collectors.toList());
        return ResponseEntity.ok(categoryDtoList);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<CategoryDto> getById(@PathVariable Long id) {
        CategoryEntity categoryEntity = categoryService.getById(id);
        return ResponseEntity.ok(categoryMapper.toDto(categoryEntity));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<CategoryDto> create(@RequestBody @Valid CategoryCreateDto categoryCreateDto) {
        CategoryEntity createdCategoryEntity = categoryService.create(categoryCreateDto);
        CategoryDto categoryDto = categoryMapper.toDto(createdCategoryEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body(categoryDto);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(CategoryInvalidArgumentException.class)
    public Map<String, String> handleInvalidArgumentEException(CategoryInvalidArgumentException categoryInvalidArgumentException){
        Map<String,String> map = new HashMap<>();
        map.put("error", categoryInvalidArgumentException.getMessage());
        return map;
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(CategoryNotFoundException.class)
    public Map<String, String> handlerNotException(CategoryNotFoundException categoryNotFoundException){
        Map<String, String> map = new HashMap<>();
        map.put("error", categoryNotFoundException.getMessage());
        return map;
    }
}
