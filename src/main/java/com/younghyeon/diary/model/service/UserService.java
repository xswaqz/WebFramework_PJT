package com.younghyeon.diary.model.service;

import com.younghyeon.diary.model.dto.User;

public interface UserService {
    // 사용자 등록
    int insertUser(User user);

    // 사용자 수정
    void updateUser(User user);

    // 사용자 삭제
    int deleteUser(User user);

    // 사용자 검색(id & pw)
    User searchUser(User user);
}
