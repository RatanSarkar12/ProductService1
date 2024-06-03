package com.ratan.ProductService.repository;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.ratan.ProductService.Dtos.ProductDto;
import com.ratan.ProductService.models.Product;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.rmi.NotBoundException;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

        Product save(Product product);

//        Product findProductById(Long id);
//
//        Product findProductByIdEquals(Long id);
//
//        public List<Product> getAllProducts();
//
//        Optional<Product> getSingleProduct(Long productId)throws NotBoundException;
//
//        Product addNewProduct(ProductDto product);
//
//        Product updateProduct(Long productId, Product product);


}
