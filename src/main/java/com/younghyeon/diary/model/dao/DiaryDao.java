package com.younghyeon.diary.model.dao;

import com.younghyeon.diary.model.dto.Diary;

import java.util.HashMap;
import java.util.List;

public interface DiaryDao {
    //게시글 목록
    List<Diary> selectList(HashMap<String, String> params);

    //게시글 등록
    void insertDiary(Diary diary);

    //게시글 수정
    int updateDiary(Diary diary);

    //게시글 상세
    Diary selectOne(int id);

    //게시글 삭제
    int deleteDiary(int id);
}
