package com.younghyeon.diary.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.younghyeon.diary.model.dto.Video;
import com.younghyeon.diary.model.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api")
public class VideoRestController {

    private static final String SUCCESS = "success";
    private static final String FAIL = "fail";

    @Autowired
    private VideoService videoService;

    // 비디오 검색
    @GetMapping("/video")
    public ResponseEntity<List<Video>> list(String mode, String keyword){
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("mode", mode);
        params.put("keyword", keyword);
        return new ResponseEntity<List<Video>>(videoService.videoList(params), HttpStatus.OK);
    }

    // 비디오 등록
    @PostMapping("/video")
    public ResponseEntity<String> write(Video video){
        videoService.registVideo(video);
        return new ResponseEntity<String>(SUCCESS, HttpStatus.CREATED);
    }

    // 비디오 상세
    @GetMapping("/video/{id}")
    public ResponseEntity<Video> detail(@PathVariable int id){
        return new ResponseEntity<Video>(videoService.videoDetail(id), HttpStatus.OK);
    }

    // 비디오 수정
    @PutMapping("/video")
    public ResponseEntity<String> update(Video video){
        videoService.modifyVideo(video);
        return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
    }

    // 비디오 삭제
    @DeleteMapping("/video/{id}")
    public ResponseEntity<String> delete(@PathVariable int id){
        if(videoService.removeVideo(id)){
            return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
        }
        return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
    }
    
}
