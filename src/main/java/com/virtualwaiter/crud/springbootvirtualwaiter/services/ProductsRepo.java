package com.virtualwaiter.crud.springbootvirtualwaiter.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virtualwaiter.crud.springbootvirtualwaiter.models.Product;

public interface ProductsRepo extends JpaRepository<Product, Integer> {

}
