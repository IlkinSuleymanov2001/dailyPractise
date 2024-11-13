package com.accessbank.patterns.structural.proxy.cache;

import com.accessbank.patterns.structural.proxy.thirdpartylibrary.ThirdPartyYoutubeLibrary;

import java.util.List;

public interface YoutubeCacheServiceInter extends ThirdPartyYoutubeLibrary {

    void setVideoList(List<Object> videoList);

    void setVideo(String videoId,Object video);

    void setDownloadedVideo(String videoId,Object downloadedVideo);
}
