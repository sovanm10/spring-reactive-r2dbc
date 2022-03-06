package org.sm.service;

import org.sm.model.Item;
import reactor.core.publisher.Flux;

import java.util.List;

public interface ItemService {
    Flux<Item> getItems();
}
