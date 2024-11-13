package com.accessbank.patterns.structural.proxy.repo;

import java.util.List;

public interface  YoutubeRepoInter {
    List<Object> getListVideo();

    Object getVideo(String videoId);

    Object downloadVideo(String videoId);
}
