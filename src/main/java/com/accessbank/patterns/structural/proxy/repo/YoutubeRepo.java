package com.accessbank.patterns.structural.proxy.repo;

import java.util.List;

public class YoutubeRepo  implements YoutubeRepoInter{

    @Override
    public List<Object> getListVideo() {
        return List.of();
    }

    @Override
    public Object getVideo(String videoId) {
        return null;
    }

    @Override
    public Object downloadVideo(String videoId) {
        return null;
    }
}
