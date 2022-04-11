package com.springboot.Service;

import com.springboot.models.User;

import java.util.List;

public interface UserService {

    void add(User user);

    void delete(int id);

    User get(int id);

    List<User> getAllUsers();
}
