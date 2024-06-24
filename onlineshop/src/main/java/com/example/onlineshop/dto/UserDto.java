package com.example.onlineshop.dto;

import com.example.onlineshop.enums.UserRole;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDto {
    private long id;
    private String name;
    private String email;
    private String phone;
    private String password;
    private String role;

    public UserDto(String name, String email, String phone, String password){
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }
    public UserDto(long id, String email, String phone, String password, String role){
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.password = password;
        this.role = role;
    }

    public UserDto(long id, String name, String email, String phone, String password, UserRole role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.role = String.valueOf(role);
    }
}
