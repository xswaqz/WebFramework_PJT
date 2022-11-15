package com.younghyeon.diary.model.service;

import com.younghyeon.diary.model.dto.User;

import java.util.HashMap;
import java.util.List;

public interface UserService {
    // 사용자 목록
    List<User> userList(HashMap<String, String> params);

    // 사용자 등록
    void registUser(User user);

    // 사용자 수정
    void modifyUser(User user);

    // 사용자 상세
    User userDetail(String id);

    // 사용자 삭제
    boolean removeUser(String id);

}
