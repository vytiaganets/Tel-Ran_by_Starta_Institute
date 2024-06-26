package com.example.onlineshop.entity;

import jakarta.persistence.*;
import lombok.*;
import com.example.onlineshop.enums.UserRole;
@Entity
@Table(name = "Users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private String phone;
    private String password;
    @Enumerated(EnumType.STRING)
    private UserRole role = UserRole.USER;
    public UserEntity(String name,String email, String phone, String password){
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.role = UserRole.USER;
    }
}
