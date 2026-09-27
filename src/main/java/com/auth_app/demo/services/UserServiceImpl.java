package com.auth_app.demo.services;

import com.auth_app.demo.dtos.UserDto;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserServices{
    @Override
    public UserDto createUser(UserDto userDto) {
        return null;
    }

    @Override
    public UserDto getUserByEmail(String email) {
        return null;
    }

    @Override
    public UserDto updateUser(UserDto userDto, String userId) {
        return null;
    }

    @Override
    public void deleteUser(String useId) {

    }

    @Override
    public UserDto getUserById(String userId) {
        return null;
    }

    @Override
    public Iterable<UserDto> getAllUser() {
        return null;
    }
}
