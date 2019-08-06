package com.advyteam.es.eventsourcingcqrsaxonspringboot.services.queries;

import com.advyteam.es.eventsourcingcqrsaxonspringboot.entities.AccountQueryEntity;

import java.util.List;

public interface AccountQueryService {
    public List<Object> listEventsForAccount(String accountNumber);
    public AccountQueryEntity getAccount(String accountNumber);
}
