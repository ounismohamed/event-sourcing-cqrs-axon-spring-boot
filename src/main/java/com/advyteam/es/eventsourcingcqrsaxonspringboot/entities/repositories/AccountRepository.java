package com.advyteam.es.eventsourcingcqrsaxonspringboot.entities.repositories;

import com.advyteam.es.eventsourcingcqrsaxonspringboot.entities.AccountQueryEntity;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<AccountQueryEntity, String> {
}
