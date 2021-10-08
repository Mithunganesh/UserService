package com.ideas2it.healthcare.userservice.service;

import com.ideas2it.healthcare.userservice.entity.UserEntity;

import java.util.UUID;

public interface UserService {
    public UserEntity save(UserEntity userEntity);

    public UserEntity findById(UUID uuid);

    public UserEntity update(UserEntity userEntity);

    public boolean deleteUserById(UUID uuid);
}
