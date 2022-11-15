package com.younghyeon.diary.controller;

import com.younghyeon.diary.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserRestController {

    private static final String SUCCESS = "success";
    private static final String FAIL = "fail";

    @Autowired
    private UserService userService;

    // 사용자 등록

    // 사용자 수정
    
    // 사용자 상세
    
    // 사용자 삭제
    
    // 사용자 목록
    
    // 사용자 검색

}
