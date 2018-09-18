package com.voronovich.user.controller;

import com.voronovich.user.entity.User;
import com.voronovich.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/person")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public User getById(@PathVariable String id) {
        return userService.getById(id);
    }

    @PostMapping
    @ResponseBody
    public void save(@RequestBody User person) {
        userService.save(person);
    }
}