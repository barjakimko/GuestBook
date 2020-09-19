package com.example.servingwebcontent.DAO;

import com.example.servingwebcontent.Model.User;

import java.util.List;

public interface UserDao {
    List<User> getUsers();

    void addUser(User user);

    void deleteUser(User user);
}
