package com.stepp.dennis.model;

import java.util.Date;

public interface Event {

    void setTeams(String home, String visitor);
    void schedule(Date date);

    void delete();
    void trigger();
    void expire();
}
