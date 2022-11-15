package com.younghyeon.diary.model.service;

import com.younghyeon.diary.model.dao.VideoDao;
import com.younghyeon.diary.model.dto.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoDao videoDao;

    @Override
    public List<Video> videoList(HashMap<String, String> params) {
        return videoDao.videoList(params);
    }

    @Override
    public void registVideo(Video video) {
        videoDao.insertVideo(video);
    }

    @Override
    public void modifyVideo(Video video) {
        videoDao.updateVideo(video);
    }

    @Override
    public Video videoDetail(int id) {
        return videoDao.videoDetail(id);
    }

    @Override
    public boolean removeVideo(int id) {
        videoDao.deleteVideo(id);
        return true;
    }
}
