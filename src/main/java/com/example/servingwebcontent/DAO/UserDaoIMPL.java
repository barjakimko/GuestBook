package com.example.servingwebcontent.DAO;

import com.example.servingwebcontent.Model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class UserDaoIMPL implements UserDao{

    private List<User> users= Stream.of(
            new User("Przemek Raczkowski", "Kraków, ul. Kijowska 54", 1),
            new User("Tomasz Hajto", "Berlin, Herta StraBe", 2))
            .collect(Collectors.toList());

    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void deleteUser(User user) {
        users.remove(user);
    }
}
