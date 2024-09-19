package com.scaler.EcomProductService.controller;

import com.scaler.EcomProductService.dto.ProductResponseDTO;
import com.scaler.EcomProductService.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {
    @GetMapping("/product")
    public ResponseEntity getAllProduct() {
        ProductResponseDTO p1 = new ProductResponseDTO();
        p1.setId(1);
        p1.setTitle("Iphone 15 pro");
        p1.setPrice(150000);
        p1.setImage("www.google.com/images/iphone");
        p1.setDescription("Bahot Mehnga Phone");
        p1.setCategory("Electronics");


        ProductResponseDTO p2 = new ProductResponseDTO();
        p2.setId(2);
        p2.setTitle("Macbook pro");
        p2.setPrice(250000);
        p2.setImage("www.google.com/images/macbook");
        p2.setDescription("Bahot Mehnga laptop");
        p2.setCategory("Electronics");

        List<ProductResponseDTO> products = Arrays.asList(p1, p2);
        return ResponseEntity.ok(products);
    }
}
/*
HTTP -> Tomcat -> DispatchServerlet[loads all URLs and handler mapping] -> serverlet
 */