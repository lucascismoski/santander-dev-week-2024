package com.lucascismoski.service;

import com.lucascismoski.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
