package com.example.onlineshop.service;

import com.example.onlineshop.dto.CategoryCreateDto;
import com.example.onlineshop.dto.CategoryDto;
import com.example.onlineshop.entity.CategoryEntity;
import com.example.onlineshop.exceptions.CategoryNotFoundException;
import com.example.onlineshop.mapper.CategoryMapper;
import com.example.onlineshop.repository.CategoryJpaRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(SpringExtension.class)
public class CategoryEntityServiceImplTest {
    @Mock
    private CategoryJpaRepository categoryJpaRepository;
    @Mock
    private CategoryMapper categoryMapper;
    @InjectMocks
    private CategoryServiceImpl categoryServiceImpl;

//    @Test
//    void getAllCategories(){
//        when(categoryJpaRepository.findAll()).thenReturn(Arrays.asList(new CategoryEntity(),new CategoryEntity()));
//        List<CategoryDto> result = categoryServiceImpl.getCategory();
//        assertNotNull(result);
//        assertEquals(2, result.size());
//        verify(categoryJpaRepository).findAll();
//    }
//    @Test
//    void getCategoryById_WhenCategoryExists(){
//        Long id = 1L;
//        CategoryEntity category = new CategoryEntity();
//        when(categoryJpaRepository.findById(id)).thenReturn(Optional.of(category));
//        CategoryDto result = categoryServiceImpl.getCategoryById(id);
//        assertNotNull(result);
//        verify(categoryJpaRepository).findById(id);
//    }
    @Test
    void getCategoryById_WhenCategoryDoesNotExist(){
        Long id = 1L;
        when(categoryJpaRepository.findById(id)).thenReturn(Optional.empty());
        assertThrows(CategoryNotFoundException.class, () -> categoryServiceImpl.getCategoryById(id));
        verify(categoryJpaRepository).findById(id);
    }
//    @Disabled
//    @Test
//    void createCategory(){
//        CategoryCreateDto categoryCreateDto = new CategoryCreateDto();
//        categoryCreateDto.setName("Test Category");
//        CategoryEntity category = new CategoryEntity();
//        category.setId(1L);
//        category.setName("Test Category");
//        when(categoryMapper.createDtoToEntity(any(CategoryCreateDto.class))).thenReturn(category);
//        when(categoryJpaRepository.save(any(CategoryEntity.class))).thenReturn(category);
//        CategoryDto result = categoryServiceImpl.createCategory(categoryCreateDto);
//        assertNotNull(result);
//        assertEquals(1L, result.getId());
//        assertEquals("Test Category", result.getName());
//        verify(categoryMapper).createDtoToEntity(any(CategoryCreateDto.class));
//        verify(categoryJpaRepository).save(any(CategoryEntity.class));
//    }
}
