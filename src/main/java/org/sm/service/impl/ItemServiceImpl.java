package org.sm.service.impl;

import org.sm.model.Item;
import org.sm.repository.ItemRepository;
import org.sm.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Flux<Item> getItems() {
        return itemRepository.findAll();
    }
}
