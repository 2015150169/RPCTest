package com.cwh.service.impl;

import com.cwh.service.EchoService;

public class EchoServiceImpl implements EchoService {

    @Override
    public String echo(String ping) {
        return ping != null ? ping + " --> I am ok." : "I am ok.";
    }

    @Override
    public String login(String ping) {
        return ping != null ? ping + " --> I am login." : "I am login.";
    }

    @Override
    public String logout(String ping) {
        return ping != null ? ping + " --> I am logout." : "I am logout.";
    }


}
