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
        return userDao.userList(params);
    }

    @Override
    public void registUser(User user) {
        userDao.insertUser(user);
    }

    @Override
    public void modifyUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public User userDetail(String id) {
        return userDao.userDetail(id);
    }

    @Override
    public boolean removeUser(String id) {
        userDao.deleteUser(id);
        return true;
    }

}
