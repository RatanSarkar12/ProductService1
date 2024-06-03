package com.ratan.ProductService.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Catagory extends BaseModel {
    private String name;
    private String description;
    @OneToMany
    private List<Product>products;
}
