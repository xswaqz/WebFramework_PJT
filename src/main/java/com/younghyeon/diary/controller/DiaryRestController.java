package com.younghyeon.diary.controller;

import com.younghyeon.diary.model.dto.Diary;
import com.younghyeon.diary.model.service.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DiaryRestController {
    private static final String SUCCESS = "success";
    private static final String FAIL = "fail";

    @Autowired
    private DiaryService diaryService;

    @GetMapping("/diary")
    public ResponseEntity<List<Diary>> list(String mode, String keyword){
        HashMap<String, String> params = new HashMap<String, String>();

        params.put("mode", mode);
        params.put("keyword", keyword);

        return new ResponseEntity<List<Diary>>(diaryService.getDiaryList(params), HttpStatus.OK);
    }

    @PostMapping("/diary")
    public ResponseEntity<String> write(Diary diary){
        diaryService.writeDiary(diary);
        return new ResponseEntity<String>(SUCCESS, HttpStatus.CREATED);
    }

    @GetMapping("/diary/{id}")
    public ResponseEntity<Diary> detail(@PathVariable int id){
        return new ResponseEntity<Diary>(diaryService.getDiary(id), HttpStatus.OK);
    }

    //게시글 수정
    @PutMapping("/diary")
    public ResponseEntity<String> update(Diary diary){
        diaryService.modifyDiary(diary);
        return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
    }

    //게시글 삭제
    @DeleteMapping("/diary/{id}")
    public ResponseEntity<String> delete(@PathVariable int id){
        if(diaryService.removeDiary(id)){
            return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
        }
        return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
    }
}
