package org.sm.repository;

import org.sm.model.Item;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ItemRepository extends ReactiveCrudRepository<Item,Long> {
}
