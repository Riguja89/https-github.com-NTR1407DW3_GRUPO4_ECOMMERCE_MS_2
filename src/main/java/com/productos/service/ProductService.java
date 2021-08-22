package com.productos.service;

import com.productos.repositories.ProductRepository;
import com.productos.models.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service

@Transactional

public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> listaProduct(){
        return  productRepository.findAll();
    }


}
