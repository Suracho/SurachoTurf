package com.suracho.surachoturf.repositories;

import com.suracho.surachoturf.models.TurfUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TurfUserRepository extends JpaRepository<TurfUser, Long> {
    TurfUser findByEmail(String email);
}
