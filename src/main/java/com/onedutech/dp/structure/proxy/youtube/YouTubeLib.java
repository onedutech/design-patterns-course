package com.onedutech.dp.structure.proxy.youtube;


import java.util.HashMap;

public interface YouTubeLib {
    Video getVideo(String videoId);

    HashMap<String, Video> popularVideos();

}
