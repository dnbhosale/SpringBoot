package com.SpringDemoJPA.SpringJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringDemoJPA.SpringJPA.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
