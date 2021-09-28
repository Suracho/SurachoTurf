package com.suracho.surachoturf.repositories;

import com.suracho.surachoturf.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByName(String name);
}
