package com.jorge.curso.springboot.backend.backend_products.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.jorge.curso.springboot.backend.backend_products.entities.Product;

@CrossOrigin(originPatterns = "http://localhost:5173/")
@RepositoryRestResource(path = "products")
public interface ProductRepository extends CrudRepository<Product, Long>{


}
