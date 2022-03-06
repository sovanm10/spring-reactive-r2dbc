package org.sm.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter @Setter @Builder
@Table("item")
public class Item {
    @Id
    private long id;
    private String name;
    private String brand;
}