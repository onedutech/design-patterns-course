package com.onedutech.dp.structure.proxy.youtube;


public class Application {

    public static void main(String[] args) {
        YouTubeLib api = new YouTubeCacheProxy();
        //Map<String, Video> videos = api.popularVideos();
        Video video = api.getVideo("catzzzzzzzzz");
        Video video2 = api.getVideo("dancesvideoo");

        Video video_again = api.getVideo("catzzzzzzzzz");
        Video video2_again = api.getVideo("dancesvideoo");


  /*      YouTubeLib cache = new YouTubeCacheProxy();
        cache.popularVideos();
        cache.getVideo("catzzzzzzzzz");
        cache.getVideo("dancesvideoo");

        cache.popularVideos();
        cache.getVideo("catzzzzzzzzz");
        cache.getVideo("dancesvideoo");*/
    }

}