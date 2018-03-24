package com.stepp.dennis.model;

import com.stepp.dennis.domain.HockeyGame;

public class EventFactory {
    public Event getEvent(String eventType){
        if(eventType == null){
            return null;
        }
        if(eventType.equalsIgnoreCase("HOCKEY")){
            return new HockeyGame();
        }
        return  null;
    }
}
