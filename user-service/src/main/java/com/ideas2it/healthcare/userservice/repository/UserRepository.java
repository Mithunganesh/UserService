package com.ideas2it.healthcare.userservice.repository;

import com.ideas2it.healthcare.userservice.dto.UserDto;
import com.ideas2it.healthcare.userservice.entity.RoleSearchEntity;
import jdk.jfr.Name;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import javax.persistence.NamedQuery;
import javax.transaction.Transactional;
import java.util.Optional;
import java.util.UUID;

@Repository
@EnableJpaRepositories
public interface UserRepository extends JpaRepository<UserDto, UUID> {
    @Query("select new com.ideas2it.healthcare.userservice.dto.UserDto(u.userId,u.userName,u.password,u.roleId,u.createdTime,u.lastUpdatedTime) from UserDto u where u.userName = :name")
    public Optional<UserDto> findByName(String name);

    @Query("select new com.ideas2it.healthcare.userservice.entity.RoleSearchEntity(u.userName,r.roleName) from RoleDto r Join r.users u where u.userName = :name")
    public RoleSearchEntity findRoleByUserName(String name);

    @Modifying
    @Transactional
    @Query(value = "update UserDto set roleId = :roleId where userName = :name")
    public Integer update(UUID roleId , String name);

}
