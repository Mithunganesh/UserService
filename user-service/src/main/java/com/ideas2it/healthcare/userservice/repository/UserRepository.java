package com.ideas2it.healthcare.userservice.repository;

import com.ideas2it.healthcare.userservice.dto.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
@EnableJpaRepositories
public interface UserRepository extends JpaRepository<UserDto, UUID> {
    @Query("")
    Optional<UserDto> findByName(String name);
}
