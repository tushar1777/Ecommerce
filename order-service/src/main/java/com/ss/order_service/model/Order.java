package com.ss.order_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Order {
    @Id
    private String id;
    private String productId;
    private int quantity;
    // Getters and setters
}
