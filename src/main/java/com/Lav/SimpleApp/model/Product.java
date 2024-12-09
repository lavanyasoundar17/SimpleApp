package com.Lav.SimpleApp.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;
import jakarta.persistence.Id;

@Data

@Component
@Entity
public class Product {
  @Id
    private int prodId;
    private String prodName;
    private int price;

}
