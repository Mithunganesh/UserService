package com.ideas2it.healthcare.userservice.repository;

import com.ideas2it.healthcare.userservice.dto.RoleDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
@EnableJpaRepositories
public interface RoleRepository extends JpaRepository<RoleDto, UUID> {
}
