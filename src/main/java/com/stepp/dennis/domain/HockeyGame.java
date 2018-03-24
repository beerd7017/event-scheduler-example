package com.stepp.dennis.domain;

import com.stepp.dennis.model.Event;

import java.util.Date;

public class HockeyGame implements Event {

    @Override
    public void setTeams(String home, String visitor) {
        System.out.println(home + " vs. " + visitor);
    }

    @Override
    public void schedule(Date date) {
        System.out.println("Scheduled a hockey game. on " + date);
    }

    @Override
    public void delete() {
        System.out.println("Game Deleted");
    }

    @Override
    public void trigger() {
        System.out.println("Game Triggered");
    }

    @Override
    public void expire() {
        System.out.println("Game Expired");
    }
}
