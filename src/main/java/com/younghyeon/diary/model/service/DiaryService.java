package com.younghyeon.diary.model.service;

import com.younghyeon.diary.model.dto.Diary;

import java.util.HashMap;
import java.util.List;

public interface DiaryService {
    //게시글 등록
    void writeDiary(Diary diary);
    //게시글 목록
    List<Diary> getDiaryList(HashMap<String, String> params);
    //게시글 조회
    Diary getDiary(int id);
    //게시글 수정
    boolean modifyDiary(Diary diary);
    //게시글 삭제
    boolean removeDiary(int id);
    //게시글 조회 증가
    void updateViewCnt(int id);

}
