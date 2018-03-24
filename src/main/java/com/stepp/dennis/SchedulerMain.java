package com.stepp.dennis;

import com.stepp.dennis.model.Event;
import com.stepp.dennis.model.EventFactory;

import java.util.Date;

public class SchedulerMain {

    public static void main(String[] args) {
        Date currentDate = new Date();
        EventFactory eventFactory = new EventFactory();
        Event event1 = eventFactory.getEvent("HOCKEY");

        event1.setTeams("Buzzards", "Anger Management");
        event1.schedule(currentDate);
    }
}
