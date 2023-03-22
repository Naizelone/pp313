package com.example.pp3_1_2.service;


import com.example.pp3_1_2.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public void saveUser(User user);

    public void deleteUser(int id);
    public User getUser(int id);

    public User findUserByEmail(String email);
}
