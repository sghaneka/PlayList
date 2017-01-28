package com.sg.napsteraccess;

import com.napster.cedar.Napster;
import com.napster.cedar.player.Player;
import com.napster.cedar.player.notification.NotificationActionListener;
import com.napster.cedar.session.SessionManager;

/**
 * Created by samgh on 1/28/2017.
 */

public class NapsterService {

    private Napster m_napster;

    public NapsterService(){
    }

    public Napster getNapster() { return m_napster; }

}