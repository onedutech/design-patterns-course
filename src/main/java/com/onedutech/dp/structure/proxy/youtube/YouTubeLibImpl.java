package com.onedutech.dp.structure.proxy.youtube;


import java.util.HashMap;

public class YouTubeLibImpl implements YouTubeLib {

    @Override
    public HashMap<String, Video> popularVideos() {
        return getRandomVideos();
    }

    @Override
    public Video getVideo(String videoId) {
        System.out.println("Downloading video " + videoId);
        return new Video(videoId, "Some video title");
    }


    private HashMap<String, Video> getRandomVideos() {
        System.out.println("Downloading populars... ");

        HashMap<String, Video> hmap = new HashMap<>();
        hmap.put("mkafksangasj" , new Video("mkafksangasj" , "Dog play with ball.mp4"));
        hmap.put("dlsdk5jfslaf" , new Video("dlsdk5jfslaf" , "Barcelona vs RealM.mov"));
        hmap.put("3sdfgsd1j333" , new Video("3sdfgsd1j333" , "Programing lesson#1.avi"));

        System.out.print("Done!" + "\n");
        return hmap;
    }


}
