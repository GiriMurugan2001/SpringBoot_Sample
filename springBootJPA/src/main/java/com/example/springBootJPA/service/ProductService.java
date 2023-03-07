package com.example.springBootJPA.service;

import com.example.springBootJPA.entity.Product;
import com.example.springBootJPA.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;


            // Post One
    public Product saveProduct(Product product){
        return repository.save(product);
    }
          // Post List
    public List<Product> saveProducts(List<Product> products){
        return repository.saveAll(products);
    }

        // Find All
    public List<Product> getProducts(){
        return repository.findAll();
    }
       // Find using Id
    public Product getProductById(int id){
        return repository.findById(id).orElse(null);
    }
       // Find using Name
    public Product getProductByName(String name){
        return repository.findByName(name);
    }

        // Delete using id
    public String deleteProductById(int id){
        repository.deleteById(id);
        return "Product Removed !! " +id;
    }
        // Update using by id
    public Product updateById(Product product){
        Product existingProduct = repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setQuantity(product.getQuantity());
        return repository.save(existingProduct);

    }

    public Product updateProduct(Product product) {
        return repository.update(product);
    }

    public String deleteProduct(int id) {
        return "Product is Removed";
    }
}
