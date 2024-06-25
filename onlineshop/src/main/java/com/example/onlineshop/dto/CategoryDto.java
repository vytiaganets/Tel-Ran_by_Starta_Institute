package com.example.onlineshop.dto;

import lombok.*;
@Setter
@Getter
@NoArgsConstructor
public class CategoryDto {
    private  Long  id;
    private String name;
    public CategoryDto(Long id, String name){
        this.id = id;
        this.name = name;
    }
}