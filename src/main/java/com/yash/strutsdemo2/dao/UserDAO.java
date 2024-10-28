package com.yash.strutsdemo2.dao;

import com.yash.strutsdemo2.model.User;

import java.util.List;

public interface UserDAO {

    void addUser(User user);
    List<User> getAllUsers();
    void updateUser(User user);
    void deleteUser(int id);
}
