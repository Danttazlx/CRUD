package com.example.Crud;

import com.example.Crud.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repositoryCrud extends JpaRepository<Product, Long> {


}
