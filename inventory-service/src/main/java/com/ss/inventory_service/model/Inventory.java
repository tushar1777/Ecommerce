package com.ss.inventory_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Inventory {
    @Id
    private String productId;
    private int quantity;
    // Getters and setters
}