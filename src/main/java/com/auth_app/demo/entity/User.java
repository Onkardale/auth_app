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


   @ManyToMany(fetch = FetchType.EAGER)
   @JoinTable(name = "roles",
   joinColumns  = @JoinColumn(name ="user_id"),
    inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();




@PrePersist
   protected void onCreate(){
       Instant now = Instant.now();
       if (createdAt == null) createdAt = now;
       updatedAt = now;

   }


   @PreUpdate
protected  void onUpdate(){
       updatedAt = Instant.now();

}





































}
