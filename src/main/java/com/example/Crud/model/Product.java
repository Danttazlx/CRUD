package com.example.Crud.model;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Product {

    private long id;
    private String name;
    private int quantity;
    private String description;


}
