package com.younghyeon.diary.model.dao;

import com.younghyeon.diary.model.dto.Video;

import java.util.HashMap;
import java.util.List;

public interface VideoDao {
    // 비디오 목록
    List<Video> videoList(HashMap<String, String> params);

    // 비디오 등록
    void insertVideo(Video video);

    // 비디오 수정
    void updateVideo(Video video);

    // 비디오 상세
    Video videoDetail(int id);

    // 비디오 삭제
    void deleteVideo(int id);
}
