package com.henrique.HelpDesk.api.service;

import com.henrique.HelpDesk.api.security.entity.User;
import org.springframework.data.domain.Page;

public interface UserService {

    User findByEmail(String email);

    User createOrUpdate(User user);

    User findById(String id);

    void delete(String id);

    Page<User> findAll(int page, int count);
}
