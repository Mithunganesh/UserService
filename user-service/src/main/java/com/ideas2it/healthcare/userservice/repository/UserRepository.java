package com.ideas2it.healthcare.userservice.repository;

import com.ideas2it.healthcare.userservice.dto.UserDto;
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
    Optional<UserDto> findByName(String name);

    @Transactional
    @Modifying
    @Query(value = "update UserDto set roleId = :roleId where userName = :name")
    public UserDto update(UUID roleId , String name);
}
