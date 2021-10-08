package com.ideas2it.healthcare.userservice.controller;

import com.ideas2it.healthcare.userservice.entity.UserEntity;
import com.ideas2it.healthcare.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/saveUser")
    public UserEntity saveUser(@RequestBody UserEntity userEntity){
        return userService.save(userEntity);
    }

    @GetMapping("/getUser/{id}")
    public UserEntity getUser(@PathVariable String id){
        return userService.findById(UUID.fromString(id));
    }
    @DeleteMapping("/deleteUser/{id}")
    public Boolean deleteUser(@PathVariable String id){
        return userService.deleteUserById(UUID.fromString(id));
    }
}
