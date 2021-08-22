package com.productos.controllers;

import com.productos.models.Product;
import com.productos.repositories.ProductRepository;
import com.productos.dto.Mensaje;
import com.productos.dto.ProductDTO;
import com.productos.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@RestController
public class ProductController {

    private final ProductRepository productRepository;

   public ProductController(ProductRepository productRepository){
       this.productRepository = productRepository;

   }

    @GetMapping("/products/all")
    public ResponseEntity<List<Product>> listaProductos(){

        List<Product> ListaProductos = productRepository.findAll();
        return new ResponseEntity<List<Product>>(ListaProductos, HttpStatus.OK);
    }
}


