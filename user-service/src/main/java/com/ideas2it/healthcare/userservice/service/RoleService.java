package com.ideas2it.healthcare.userservice.service;

import com.ideas2it.healthcare.userservice.entity.RoleEntity;

import java.util.List;
import java.util.UUID;

public interface RoleService {
    public RoleEntity save(RoleEntity roleEntity);

    public RoleEntity getRole(UUID id);

    List<RoleEntity> getRoles();
}
