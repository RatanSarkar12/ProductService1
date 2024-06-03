package com.ratan.ProductService.service;

import com.ratan.ProductService.Dtos.ProductDto;
import com.ratan.ProductService.models.Product;
import org.springframework.stereotype.Service;

import java.rmi.NotBoundException;
import java.util.List;
import java.util.Optional;

public interface IProductService {
    public List<Product> getAllProducts();

    Optional<Product> getSingleProduct(Long productId)throws NotBoundException;

    Product addNewProduct(ProductDto product);

    Product updateProduct(Long productId, Product product);
}
