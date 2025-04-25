package com.onedutech.dp.structure.proxy.youtube;


import java.util.HashMap;

public class YouTubeCacheProxy implements YouTubeLib {
    private final YouTubeLibImpl youtubeService;
    private final HashMap<String, Video> cacheAll = new HashMap<>();
    private HashMap<String, Video> cachePopular = new HashMap<>();

    public YouTubeCacheProxy() {
        this.youtubeService = new YouTubeLibImpl();
    }

    @Override
    public HashMap<String, Video> popularVideos() {
        if (cachePopular.isEmpty()) {
            cachePopular = youtubeService.popularVideos();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null) {
            video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        }
        return video;
    }


}
