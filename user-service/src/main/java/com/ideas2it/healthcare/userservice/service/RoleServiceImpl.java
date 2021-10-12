package com.ideas2it.healthcare.userservice.service;

import com.ideas2it.healthcare.userservice.dto.RoleDto;
import com.ideas2it.healthcare.userservice.dto.UserDto;
import com.ideas2it.healthcare.userservice.entity.RoleEntity;
import com.ideas2it.healthcare.userservice.repository.RoleRepository;
import com.ideas2it.healthcare.userservice.util.EntityDtoConversionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class RoleServiceImpl implements RoleService{
    @Autowired
    RoleRepository roleRepository;
    @Override
    public RoleEntity save(RoleEntity roleEntity) {
        return EntityDtoConversionUtils.formRoleEntity(roleRepository.save(EntityDtoConversionUtils.formRoleDto(roleEntity)));
    }

    @Override
    public RoleEntity getRole(UUID id) {
        Optional<RoleDto> op = roleRepository.findById(id);
        if(op.isPresent()){
            System.out.println(op.get());
            return EntityDtoConversionUtils.formRoleEntity(op.get());}
        else{
            return null;}
    }

    @Override
    public List<RoleEntity> getRoles() {

        List<RoleDto> roleDtolist=roleRepository.findAll();
        List<RoleEntity> roleEntitylist=roleDtolist.stream().map(dto-> EntityDtoConversionUtils.formRoleEntity(dto)).collect(Collectors.toList());
        return roleEntitylist;
    }
}
