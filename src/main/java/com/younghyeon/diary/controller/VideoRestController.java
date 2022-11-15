package com.younghyeon.diary.controller;

<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
=======
import com.younghyeon.diary.model.dto.Video;
import com.younghyeon.diary.model.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
>>>>>>> 07f6197066437ebc5570f152f1c28fe94395ef01

@RestController
@RequestMapping("/api")
public class VideoRestController {
<<<<<<< HEAD

=======
    private static final String SUCCESS = "success";
    private static final String FAIL = "fail";

    @Autowired
    private VideoService videoService;

    @GetMapping("/video")
    public ResponseEntity<List<Video>> list(String mode, String keyword){
        HashMap<String, String> params = new HashMap<String, String>();

        params.put("mode", mode);
        params.put("keyword", keyword);

        return new ResponseEntity<List<Video>>(videoService.getVideoList(params), HttpStatus.OK);
    }

    @PostMapping("/video")
    public ResponseEntity<String> write(Video video){
        videoService.writeVideo(video);
        return new ResponseEntity<String>(SUCCESS, HttpStatus.CREATED);
    }

    @GetMapping("/video/{id}")
    public ResponseEntity<Video> detail(@PathVariable int id){
        return new ResponseEntity<Video>(videoService.getVideo(id), HttpStatus.OK);
    }

    //게시글 수정
    @PutMapping("/video")
    public ResponseEntity<String> update(Video video){
        videoService.modifyVideo(video);
        return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
    }

    //게시글 삭제
    @DeleteMapping("/video/{id}")
    public ResponseEntity<String> delete(@PathVariable int id){
        if(videoService.removeVideo(id)){
            return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
        }
        return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
    }
    
>>>>>>> 07f6197066437ebc5570f152f1c28fe94395ef01
}
