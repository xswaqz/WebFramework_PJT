package com.younghyeon.diary.controller;

import com.younghyeon.diary.model.dto.User;
import com.younghyeon.diary.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserRestController {

    private static final String SUCCESS = "success";
    private static final String FAIL = "fail";

    @Autowired
    private UserService userService;

    // 사용자 등록
    @PostMapping("/user")
    public ResponseEntity<String> regist(User user) {
        userService.registUser(user);
        return new ResponseEntity<String>(SUCCESS, HttpStatus.CREATED);
    }

    // 사용자 수정
    @PutMapping("/user")
    public ResponseEntity<String> update(User user) {
        userService.modifyUser(user);
        return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
    }
    
    // 사용자 상세
    @GetMapping("/user/{id}")
    public ResponseEntity<User> detail(@PathVariable String id) {
        return new ResponseEntity<>(userService.userDetail(id), HttpStatus.OK);
    }
    
    // 사용자 삭제
    @DeleteMapping("/user/{id}")
    public ResponseEntity<String> delete(@PathVariable String id) {
        if(userService.removeUser(id)) {
            return new ResponseEntity<>(SUCCESS, HttpStatus.OK);
        }
        return new ResponseEntity<>(FAIL, HttpStatus.NO_CONTENT);
    }
    
    // 사용자 검색
    @GetMapping("/user")
    public ResponseEntity<List<User>> list(String mode, String keyword) {
        HashMap<String, String> params = new HashMap<>();
        params.put("mode", mode);
        params.put("keyword", keyword);
        return new ResponseEntity<List<User>>(userService.userList(params), HttpStatus.OK);
    }

}
