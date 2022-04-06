package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Product;

public interface ProductRepository extends JpaRepository<Product, String>{

	Product findByName(String name);

	Optional<Product> findById(int id);

	void deleteById(int id);

	Product findByPrice(double price);

	Product findByType(String type);

	Product findByCategory(String category);

	//Product  deleteById(int id);

	


}
