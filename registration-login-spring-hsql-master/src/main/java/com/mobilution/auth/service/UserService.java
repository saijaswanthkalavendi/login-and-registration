package com.mobilution.auth.service;

import com.mobilution.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
