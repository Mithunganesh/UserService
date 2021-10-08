package com.ideas2it.healthcare.userservice.service;

import com.ideas2it.healthcare.userservice.dto.UserDto;
import com.ideas2it.healthcare.userservice.entity.UserEntity;
import com.ideas2it.healthcare.userservice.repository.UserRepository;
import com.ideas2it.healthcare.userservice.util.EntityDtoConversionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public UserEntity save(UserEntity userEntity) {
         return EntityDtoConversionUtils.formEntity(userRepository.save(EntityDtoConversionUtils.formUserDto(userEntity)));
    }

    @Override
    public UserEntity findById(UUID uuid) {
        Optional<UserDto> op = userRepository.findById(uuid);
        if(op.isPresent())
            return EntityDtoConversionUtils.formEntity(op.get());
        else
            return null;
    }

    public UserEntity findByName(String name) {
        Optional<UserDto> op = userRepository.findByName(name);
        if(op.isPresent())
            return EntityDtoConversionUtils.formEntity(op.get());
        else
            return null;
    }



    public UserEntity update(UserEntity userEntity){
        return null;
    }

    @Override
    public boolean deleteUserById(UUID uuid) {
        Optional<UserDto> op = userRepository.findById(uuid);
        if(op.isPresent()){
            userRepository.delete(op.get());
            return true;
        }else{
        return false;}
    }
}
