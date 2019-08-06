package com.advyteam.es.eventsourcingcqrsaxonspringboot.events;

import com.advyteam.es.eventsourcingcqrsaxonspringboot.aggregates.Status;

public class AccountHeldEvent extends BaseEvent<String> {

    public final Status status;

    public AccountHeldEvent(String id, Status status) {
        super(id);
        this.status = status;
    }
}
