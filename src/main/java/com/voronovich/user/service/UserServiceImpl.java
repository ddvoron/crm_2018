package com.voronovich.user.service;

import com.voronovich.user.entity.User;
import com.voronovich.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service("userDetailsService")
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void delete(String id) {
        userRepository.deleteById(id);
    }

    @Override
    public void save(User user) {
        userRepository.save(mapper(user));
    }

    @Override
    public void update(User user) {
        userRepository.save(user);
    }

    @Override
    public User getById(String id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public Page<User> getByPage(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public User getByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    private User mapper(User user) {
        User mappedUser = new User();
        mappedUser.setName(user.getName());
        mappedUser.setSurname(user.getSurname());
        mappedUser.setPatronymic(user.getPatronymic());
        return mappedUser;
    }
}