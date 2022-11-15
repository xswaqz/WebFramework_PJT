package com.younghyeon.diary.model.dao;

import com.younghyeon.diary.model.dto.User;

import java.util.HashMap;
import java.util.List;

public interface UserDao {
    // 사용자 목록
    List<User> userList(HashMap<String, String> params);
    
    // 사용자 등록
    void insertUser(User user);

    // 사용자 수정
    void updateUser(User user);

    // 사용자 상세
    User userDetail(String id);

    // 사용자 삭제
    void deleteUser(String id);
    // 사용자 검색
    List<User> searchUser(String id);
}
