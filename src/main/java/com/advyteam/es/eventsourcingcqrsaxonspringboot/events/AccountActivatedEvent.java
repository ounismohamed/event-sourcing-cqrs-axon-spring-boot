package com.advyteam.es.eventsourcingcqrsaxonspringboot.events;

import com.advyteam.es.eventsourcingcqrsaxonspringboot.aggregates.Status;

public class AccountActivatedEvent extends BaseEvent<String> {

    public final Status status;

    public AccountActivatedEvent(String id, Status status) {
        super(id);
        this.status = status;
    }
}
