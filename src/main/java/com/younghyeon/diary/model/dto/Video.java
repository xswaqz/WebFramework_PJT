package com.younghyeon.diary.model.dto;

public class Video {
    private int videoId;
    private String title;
    private String url;
    private String exercisePart;
    private String content;
    private String thumbnail;
    private int viewCnt;

    public Video() {
    }

    public Video(int videoId, String title, String url, String exercisePart, String content, String thumbnail, int viewCnt) {
        this.videoId = videoId;
        this.title = title;
        this.url = url;
        this.exercisePart = exercisePart;
        this.content = content;
        this.thumbnail = thumbnail;
        this.viewCnt = viewCnt;
    }

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getExercisePart() {
        return exercisePart;
    }

    public void setExercisePart(String exercisePart) {
        this.exercisePart = exercisePart;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public int getViewCnt() {
        return viewCnt;
    }

    public void setViewCnt(int viewCnt) {
        this.viewCnt = viewCnt;
    }

    @Override
    public String toString() {
        return "Video{" +
                "videoId=" + videoId +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", exercisePart='" + exercisePart + '\'' +
                ", content='" + content + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", viewCnt=" + viewCnt +
                '}';
    }
}
