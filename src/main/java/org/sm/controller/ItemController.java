package org.sm.controller;

import lombok.RequiredArgsConstructor;
import org.sm.model.Item;
import org.sm.service.ItemService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
@RequestMapping(value="items", produces = MediaType.APPLICATION_JSON_VALUE)
public class ItemController {

    private final ItemService itemService;

    @GetMapping
    public ResponseEntity<Flux<Item>> getItems(){
        return ResponseEntity.ok().body(itemService.getItems());
    }
}
