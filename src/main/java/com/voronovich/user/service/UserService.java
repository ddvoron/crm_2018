package com.voronovich.user.service;

import com.voronovich.user.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    void delete(String id);

    void save(User user);

    void update(User user);

    User getById(String id);

    User getByEmail(String email);

    Page<User> getByPage(Pageable pageable);

}