package com.sg.musicdatalayer;

/**
 * Created by samgh on 1/28/2017.
 */

public class MusicSource implements IMusicSource {

    public String[] getPlayLists(){
        String[] playLists = { "juju latest", "juju", "90s rock", "toddler"};
        return playLists;
    }

}