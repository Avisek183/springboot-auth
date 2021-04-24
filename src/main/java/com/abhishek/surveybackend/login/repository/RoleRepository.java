package com.abhishek.surveybackend.login.repository;

import com.abhishek.surveybackend.login.models.ERole;
import com.abhishek.surveybackend.login.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}