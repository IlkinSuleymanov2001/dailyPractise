package com.accessbank.patterns.structural.proxy.service;

import com.accessbank.patterns.structural.proxy.cache.YoutubeCacheServiceInter;
import com.accessbank.patterns.structural.proxy.thirdpartylibrary.ThirdPartyYoutubeLibrary;

import java.util.List;

public class ProxyCachedYoutubeService implements ThirdPartyYoutubeLibrary {

    private final YoutubeCacheServiceInter youtubeCacheService;
    private final ThirdPartyYoutubeLibrary youtubeRealService;

    public ProxyCachedYoutubeService(YoutubeCacheServiceInter youtubeCacheService,
                                     ThirdPartyYoutubeLibrary youtubeRealService) {
        this.youtubeCacheService = youtubeCacheService;
        this.youtubeRealService = youtubeRealService;
    }

    @Override
    public List<Object> getListVideo() {
        if (youtubeCacheService.getListVideo() != null && !youtubeCacheService.getListVideo().isEmpty()) return youtubeCacheService.getListVideo();
        List<Object> listVideo = youtubeRealService.getListVideo();
        youtubeCacheService.setVideoList(listVideo);
        return listVideo;
    }

    @Override
    public Object getVideo(String videoId) {
        if (youtubeCacheService.getVideo(videoId) != null) return youtubeCacheService.getVideo(videoId);

        Object video = youtubeRealService.getVideo(videoId);
        youtubeCacheService.setVideo(videoId,video);
        return video;
    }

    @Override
    public Object downloadVideo(String videoId) {
        if (youtubeCacheService.downloadVideo(videoId) != null) return youtubeCacheService.downloadVideo(videoId);
        Object downloadedVideo = youtubeRealService.downloadVideo(videoId);
        youtubeCacheService.setVideo(videoId,downloadedVideo);
        return downloadedVideo;

    }
}
