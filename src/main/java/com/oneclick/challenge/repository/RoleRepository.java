package com.oneclick.challenge.repository;

import com.oneclick.challenge.models.ERole;
import com.oneclick.challenge.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}