package com.yash.strutsdemo2.daoimpl;

import com.yash.strutsdemo2.model.User;

import java.util.List;

public interface UserDaoImpl {

     void addUser(User user);
     List<User> getAllUsers();
     void updateUser(User user);
        void deleteUser(int id);
}
