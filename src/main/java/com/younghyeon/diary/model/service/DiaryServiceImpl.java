package com.younghyeon.diary.model.service;

import com.younghyeon.diary.model.dao.DiaryDao;
import com.younghyeon.diary.model.dto.Diary;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;

public class DiaryServiceImpl implements DiaryService {

    @Autowired
    private DiaryDao diaryDao;

    @Override
    public List<Diary> selectList(HashMap<String, String> params) {
        return null;
    }

    @Override
    public void writeDiary(Diary diary) {

    }

    @Override
    public int updateDiary(Diary diary) {
        return 0;
    }

    @Override
    public Diary selectOne(int id) {
        return null;
    }

    @Override
    public int deleteDiary(int id) {
        return 0;
    }

    @Override
    public void updateViewCnt(int id) {

    }
}
