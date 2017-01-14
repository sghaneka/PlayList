package com.sg.MusicLayer;

/**
 * Created by samgh on 1/14/2017.
 */

public class MusicSource implements IMusicSource {

    public String[] getPlayLists(){
        String[] playLists = { "juju latest", "juju", "90s rock", "toddler"};
        return playLists;
    }

}
