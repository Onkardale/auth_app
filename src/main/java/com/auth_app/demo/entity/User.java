package com.auth_app.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.security.PrivateKey;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.UUID)
    @Column(name = "user_id")
    private UUID id;

    @Column(name = "user_email", length = 300,unique = true,nullable = false)
    private String email;

    @Column(name = "user_name", length = 300,nullable = false)
    private String name;
    private String password;
    private  String image;
    private boolean enable = true;
    private Instant createdAt =Instant.now();
    private Instant updatedAt = Instant.now();


   // private  String gender;
   // private Address address;

   @Enumerated (EnumType.STRING)
    private Provider provider = Provider.Local;
    private Set<Role> roles = new HashSet<>();













































}
