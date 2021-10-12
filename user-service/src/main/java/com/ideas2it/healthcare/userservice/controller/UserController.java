package com.ideas2it.healthcare.userservice.controller;

import com.ideas2it.healthcare.userservice.entity.ResultEntity;
import com.ideas2it.healthcare.userservice.entity.RoleEntity;
import com.ideas2it.healthcare.userservice.entity.RoleSearchEntity;
import com.ideas2it.healthcare.userservice.entity.UserEntity;
import com.ideas2it.healthcare.userservice.service.RoleService;
import com.ideas2it.healthcare.userservice.service.UserService;
import com.ideas2it.healthcare.userservice.util.EntityDtoConversionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    RoleService roleService;

    @PostMapping("/saveUser")
    public UserEntity saveUser(@RequestBody UserEntity userEntity){
        return userService.save(userEntity);
    }

    @GetMapping("/getUser/{id}")
    public UserEntity getUser(@PathVariable String id){
        return userService.findById(UUID.fromString(id));
    }

    @GetMapping("/getUserByName/{name}")
    public UserEntity getUserByName(@PathVariable String name){
        UserEntity userEntity = EntityDtoConversionUtils.formEntity(userService.findByName(name));
        return userEntity;
    }
    @DeleteMapping("/deleteUser/{id}")
    public ResultEntity deleteUser(@PathVariable String id){
        return userService.deleteUserById(UUID.fromString(id));
    }

    @PostMapping("/saveRole")
    public RoleEntity saveRole(@RequestBody RoleEntity roleEntity){
        return roleService.save(roleEntity);
    }

    @GetMapping("/getRole/{id}")
    public RoleEntity getRole(@PathVariable String id){
        return roleService.getRole(UUID.fromString(id));
    }

    @GetMapping("/getRoles")
    public List<RoleEntity> getRoles() {
        return roleService.getRoles();
    }

    @GetMapping("/getUserRole/{name}")
    public RoleSearchEntity getUserRoles(@PathVariable String name) {
        return userService.getUserRole(name);
    }

    @PutMapping("/updateUser")
    public ResultEntity updateUser(@RequestBody UserEntity userEntity){
        return userService.update(userEntity);
    }
}
