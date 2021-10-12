package com.ideas2it.healthcare.userservice.service;

import com.ideas2it.healthcare.userservice.dto.UserDto;
import com.ideas2it.healthcare.userservice.entity.ResultEntity;
import com.ideas2it.healthcare.userservice.entity.RoleSearchEntity;
import com.ideas2it.healthcare.userservice.entity.UserEntity;

import java.util.UUID;

public interface UserService {
    public UserEntity  save(UserEntity userEntity);

    public UserEntity findById(UUID uuid);

    public UserDto findByName(String name);

    public ResultEntity update(UserEntity userEntity);

    public ResultEntity deleteUserById(UUID uuid);

    public RoleSearchEntity getUserRole(String userName);
}
