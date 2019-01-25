package com.geely.design.pattern.structural.adapter;

public class MediaAdapterClass extends MediaAdapterObject implements  MediaPlayer{


    public MediaAdapterClass(String audioType) {
        super(audioType);
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
