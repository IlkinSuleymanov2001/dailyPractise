package com.accessbank.patterns.structural.proxy;

import com.accessbank.patterns.structural.proxy.thirdpartylibrary.ThirdPartyYoutubeLibrary;

import java.util.List;

public class YoutubeManager {

    private final ThirdPartyYoutubeLibrary proxyYoutubeCachedService;

    public YoutubeManager(ThirdPartyYoutubeLibrary proxyYoutubeCachedService) {
        this.proxyYoutubeCachedService = proxyYoutubeCachedService;
    }

    public Object renderVideoPage(String id) {
        return proxyYoutubeCachedService.getVideo(id);
        // Render the video page.
    }


    public List<Object> renderListPanel() {
        return proxyYoutubeCachedService.getListVideo();
        // Render the list of video thumbnails.
    }

    public Object downloadResource(String id) {
        return proxyYoutubeCachedService.downloadVideo(id);
    }


    public void  reactOnUserInput(String id){
        renderVideoPage(id);
        renderListPanel();
    }




}
