package com.younghyeon.diary.model.service;

import com.younghyeon.diary.model.dao.UserDao;
import com.younghyeon.diary.model.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public List<User> userList(HashMap<String, String> params) {
        return null;
    }

    @Override
    public void createUser(User user) {

    }

    @Override
    public void modifyUser(User user) {

    }

    @Override
    public User userDetail(String id) {
        return null;
    }

    @Override
    public void removeUser(String id) {

    }
}
