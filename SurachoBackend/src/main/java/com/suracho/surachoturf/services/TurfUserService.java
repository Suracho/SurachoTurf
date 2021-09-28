package com.suracho.surachoturf.services;

import com.suracho.surachoturf.models.TurfUser;

import java.util.List;

public interface TurfUserService {
    TurfUser saveUser(TurfUser turfUser);
    TurfUser getUser(String username);
    void addRoleToUser(String email, String roleName);
    List<TurfUser>getUsers();
}
