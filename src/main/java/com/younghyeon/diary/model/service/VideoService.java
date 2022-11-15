package com.younghyeon.diary.model.service;


import com.younghyeon.diary.model.dto.Video;

import java.util.HashMap;
import java.util.List;

public interface VideoService {
    // 비디오 목록
    List<Video> videoList(HashMap<String, String> params);

    // 비디오 등록
    void registVideo(Video video);

    // 사용자 수정
    void modifyVideo(Video video);

    // 사용자 상세
    Video videoDetail(int id);

    // 사용자 삭제
    boolean removeVideo(int id);
}
