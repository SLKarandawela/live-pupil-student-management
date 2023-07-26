package com.tritonTech.studentManagement.repository;

import com.tritonTech.studentManagement.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByName(String name);
}
