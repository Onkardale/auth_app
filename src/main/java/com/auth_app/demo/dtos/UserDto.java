package com.auth_app.demo.dtos;

import com.auth_app.demo.entity.Provider;
import com.auth_app.demo.entity.Role;
import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
    private UUID id;

   private String email;

    private String name;
    private String password;
    private  String image;
    private boolean enable = true;
    private Instant createdAt =Instant.now();
    private Instant updatedAt = Instant.now();
    private Provider provider = Provider.Local;
    private Set<RoleDto> roles = new HashSet<>();



}















