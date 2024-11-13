package com.accessbank.patterns.structural.proxy.service;

import com.accessbank.patterns.structural.proxy.repo.YoutubeRepoInter;
import com.accessbank.patterns.structural.proxy.thirdpartylibrary.ThirdPartyYoutubeLibrary;

import java.util.List;

public class YoutubeService implements ThirdPartyYoutubeLibrary {

    private final YoutubeRepoInter youtubeRepository;

    public YoutubeService(YoutubeRepoInter youtubeRepository) {
        this.youtubeRepository = youtubeRepository;
    }

    @Override
    public List<Object> getListVideo() {
        System.out.println("getListVideo");
        return youtubeRepository.getListVideo();
    }

    @Override
    public Object getVideo(String videoId) {
        System.out.println("video play");
        return youtubeRepository.getVideo(videoId);
    }

    @Override
    public Object downloadVideo(String videoId) {
        System.out.println("video download");
        return youtubeRepository.downloadVideo(videoId);
    }
}
