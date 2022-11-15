package com.younghyeon.diary.model.service;

import com.younghyeon.diary.model.dao.UserDao;
import com.younghyeon.diary.model.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int insertUser(User user) {
        return 0;
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public int deleteUser(User user) {
        return 0;
    }

    @Override
    public User searchUser(User user) {
        return null;
    }
}
