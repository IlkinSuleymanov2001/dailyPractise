package com.accessbank.patterns.structural.proxy;

import com.accessbank.patterns.structural.proxy.cache.YoutubeCacheService;
import com.accessbank.patterns.structural.proxy.repo.YoutubeRepo;
import com.accessbank.patterns.structural.proxy.service.ProxyCachedYoutubeService;
import com.accessbank.patterns.structural.proxy.service.YoutubeService;

public class Main {

    public static void main(String[] args) {


        YoutubeManager manager =
                new YoutubeManager(new ProxyCachedYoutubeService(new YoutubeCacheService(), new YoutubeService(new YoutubeRepo())));

        manager.reactOnUserInput("101");


    }
}
