package com.ideas2it.healthcare.userservice.service;

import com.ideas2it.healthcare.userservice.entity.RoleEntity;
import com.ideas2it.healthcare.userservice.repository.RoleRepository;
import com.ideas2it.healthcare.userservice.util.EntityDtoConversionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService{
    @Autowired
    RoleRepository roleRepository;
    @Override
    public RoleEntity save(RoleEntity roleEntity) {
        return EntityDtoConversionUtils.formRoleEntity(roleRepository.save(EntityDtoConversionUtils.formRoleDto(roleEntity)));
    }
}
