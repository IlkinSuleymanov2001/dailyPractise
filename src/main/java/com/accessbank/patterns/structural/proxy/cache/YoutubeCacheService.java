package com.accessbank.patterns.structural.proxy.cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class YoutubeCacheService implements YoutubeCacheServiceInter
{
    private final  List<Object> videoList;
    private final HashMap<String,Object> videos;
    private final HashMap<String,Object> dowloadedVideos;

    public YoutubeCacheService(){
        videoList = new ArrayList<>();
        videos = new HashMap<>();
        dowloadedVideos = new HashMap<>();

    }

    @Override
    public void setVideoList(List<Object> videoList) {
        this.videoList.addAll(videoList);
    }

    @Override
    public void setVideo(String videoId,Object video) {
        videos.put(videoId, video);

    }

    @Override
    public void setDownloadedVideo(String videoId,Object downloadedVideo) {
        dowloadedVideos.put(videoId, downloadedVideo);
    }

    @Override
    public List<Object> getListVideo() {
       return  videoList;
    }

    @Override
    public Object getVideo(String videoId) {
        return videos.get(videoId);
    }

    @Override
    public Object downloadVideo(String videoId) {
        return dowloadedVideos.get(videoId);
    }
}
