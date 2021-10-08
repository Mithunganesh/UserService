package com.ideas2it.healthcare.userservice.util;

import com.ideas2it.healthcare.userservice.dto.RoleDto;
import com.ideas2it.healthcare.userservice.dto.UserDto;
import com.ideas2it.healthcare.userservice.entity.RoleEntity;
import com.ideas2it.healthcare.userservice.entity.UserEntity;

public class EntityDtoConversionUtils {

    public static UserEntity formEntity(UserDto userDto){
        return new UserEntity.UserEntityBuilder().userId(userDto.getUserId())
                .userName(userDto.getUserName())
                .password(userDto.getPassword())
                .roleId(userDto.getRoleId())
                .createdTime(userDto.getCreatedTime())
                .lastUpdatedTime(userDto.getLastUpdatedTime())
                .build();
    }

    public static UserDto formUserDto(UserEntity userEntity){
        UserDto userDto = new UserDto();
        userDto.setUserId(userEntity.getUserId());
        userDto.setUserName(userEntity.getUserName());
        userDto.setPassword(userEntity.getPassword());
        userDto.setRoleId(userEntity.getRoleId());
        userDto.setCreatedTime(userEntity.getCreatedTime());
        userDto.setLastUpdatedTime(userEntity.getLastUpdatedTime());
        return userDto;
    }


    public static RoleDto formRoleDto(RoleEntity roleEntity){
        RoleDto roleDto = new RoleDto();
        roleDto.setRoleId(roleEntity.getRoleId());
        roleDto.setRoleName(roleEntity.getRoleName());
        return roleDto;
    }

    public static RoleEntity formRoleEntity(RoleDto roleDto){
        return new RoleEntity.RoleEntityBuilder()
                .roleId(roleDto.getRoleId())
                .roleName(roleDto.getRoleName())
                .build();
    }

}
