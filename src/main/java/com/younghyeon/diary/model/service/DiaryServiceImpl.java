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
    public void writeBoard(Diary diary) {
        diaryDao.insertDiary(diary);
    }

    @Override
    public List<Diary> getBoardList(HashMap<String, String> params) {
        return diaryDao.selectList(params);
    }

    @Override
    public Diary getBoard(int id) {
        this.updateViewCnt(id);
        return diaryDao.selectOne(id);
    }

    @Override
    public boolean modifyBoard(Diary diary) {
        Diary originDiary = diaryDao.selectOne(diary.getId());
        originDiary.setTitle(diary.getTitle());
        originDiary.setContent(diary.getContent());
        return diaryDao.updateDiary(originDiary) == 1;
    }

    @Override
    public boolean removeBoard(int id) {
        return diaryDao.deleteDiary(id) == 1;
    }

    @Override
    public void updateViewCnt(int id) {
        Diary diary = diaryDao.selectOne(id);
        diary.setViewCnt(diary.getViewCnt()+1);
        diaryDao.updateDiary(diary);
    }
}
