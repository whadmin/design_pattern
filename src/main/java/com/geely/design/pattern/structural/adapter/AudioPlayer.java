package com.geely.design.pattern.structural.adapter;

public class AudioPlayer implements MediaPlayer {

    @Override
    public void play(String audioType, String fileName) {

        //播放 mp3 音乐文件的内置支持
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        }
        //mediaAdapterObject 提供了播放其他文件格式的支持
        else if (audioType.equalsIgnoreCase("vlc")
                || audioType.equalsIgnoreCase("mp4")) {
            MediaAdapterObject adapter = new MediaAdapterObject(audioType);
            //MediaAdapterClass  adapter = new MediaAdapterClass(audioType);
            adapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " +
                    audioType + " format not supported");
        }
    }
}
