package com.demo.service;

import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.demo.entity.Product;


public interface ProductService {
	 public Page<Product> getAllProducts(Pageable pageable) ;

	    public Product createProduct(Product product) ;

	    public Optional<Product> getProductById(Long id) ;

	    public Product updateProduct(Long id, Product productDetails) ;

	    public void deleteProduct(Long id) ;
}
