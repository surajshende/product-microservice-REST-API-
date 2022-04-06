package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/sellerAddProduct")
    public Product addProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    @PostMapping("/sellerAddProducts")
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return service.saveProducts(products);
    }
    @DeleteMapping("/sellerDeleteProductById/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }

    @GetMapping("/c_Products")
    public List<Product> findAllProducts() {
        return service.getProducts();
    }

    @GetMapping("/c_ProductById/{id}")
    public Product findProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

    @GetMapping("/c_ProductByName/{name}")
    public Product findProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    }
    @GetMapping("/c_ProductByType/{Type}")
    public Product findProductByType(@PathVariable String Type) {
        return service.getProductByType(Type);
    }
    @GetMapping("/c_ProductByCategory/{Category}")
    public Product findProductByCategory(@PathVariable String Category) {
        return service.getProductByCategary(Category);
    }
    @GetMapping("/c_ProductByPrice/{Price}")
    public Product findProductByPrice(@PathVariable double Price) {
        return service.getProductByPrice(Price);
    }

    

   
}
