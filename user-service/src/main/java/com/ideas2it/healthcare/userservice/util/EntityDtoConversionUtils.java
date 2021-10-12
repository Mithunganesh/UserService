package com.ideas2it.healthcare.userservice.util;

import com.ideas2it.healthcare.userservice.dto.RoleDto;
import com.ideas2it.healthcare.userservice.dto.UserDto;
import com.ideas2it.healthcare.userservice.entity.RoleEntity;
import com.ideas2it.healthcare.userservice.entity.UserEntity;

import java.util.List;
import java.util.stream.Collectors;

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

    public static List<UserDto> formUserDtoList(List<UserEntity> userEntities){
        if(userEntities != null)
        return userEntities.stream().map(dto -> EntityDtoConversionUtils.formUserDto(dto)).collect(Collectors.toList());
        else
            return null;
    }

    public static List<UserEntity> formUserEntityList(List<UserDto> userDtos){
        if(userDtos!=null)
        return userDtos.stream().map(entity -> EntityDtoConversionUtils.formEntity(entity)).collect(Collectors.toList());
        else
            return null;
    }

    public static RoleDto formRoleDto(RoleEntity roleEntity){
        RoleDto roleDto = new RoleDto();
        roleDto.setRoleId(roleEntity.getRoleId());
        roleDto.setRoleName(roleEntity.getRoleName());
        roleDto.setUsers(formUserDtoList(roleEntity.getUsers()));
        return roleDto;
    }

    public static RoleEntity formRoleEntity(RoleDto roleDto){
        return new RoleEntity.RoleEntityBuilder()
                .roleId(roleDto.getRoleId())
                .roleName(roleDto.getRoleName())
                .users(formUserEntityList(roleDto.getUsers()))
                .build();
    }

}
