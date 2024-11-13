package com.accessbank.patterns.structural.proxy.thirdpartylibrary;

import java.util.List;

public interface ThirdPartyYoutubeLibrary {

    List<Object> getListVideo();

    Object getVideo(String videoId);

    Object downloadVideo(String videoId);

}
