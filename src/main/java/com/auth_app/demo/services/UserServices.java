package com.auth_app.demo.services;

import com.auth_app.demo.dtos.UserDto;

public interface UserServices {


    //create user
    UserDto createUser(UserDto userDto);

    //get user by email
    UserDto getUserByEmail(String email);

    //update user
    UserDto updateUser(UserDto userDto,String userId);

    // delete user
    void deleteUser(String useId);

    //get user by id
    UserDto getUserById(String userId);

    //get all users
    Iterable<UserDto> getAllUser();




















}
