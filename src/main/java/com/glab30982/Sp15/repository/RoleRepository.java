package com.glab30982.Sp15.repository;

import com.glab30982.Sp15.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
