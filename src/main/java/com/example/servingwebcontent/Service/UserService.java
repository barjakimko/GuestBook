package com.example.servingwebcontent.Service;


import java.util.List;

import com.example.servingwebcontent.DAO.UserDao;
import com.example.servingwebcontent.Model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserDao userDao;

    public UserService(UserDao userDao){this.userDao = userDao;}

    public List<User> getAllUsers() {return  userDao.getUsers();}

    public void addUser(User user) {userDao.addUser(user);}

    public void deleteUserById(String id){
        User userToDelete= null;
        for(User user: userDao.getUsers()){
            if (String.valueOf(user.getId()).equals(id)){
                userToDelete = user;
            }
        }
        if( userToDelete!=null){
            userDao.deleteUser(userToDelete);
        }


    }

}
