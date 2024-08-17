package com.review.ms.external.service;


import com.review.ms.dto.ProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "PRODUCT-MS/api/products")
public interface IProductServiceFeign {
    @GetMapping("/{id}")
    ResponseEntity<ProductDTO> getProductById(@PathVariable String id);
}
