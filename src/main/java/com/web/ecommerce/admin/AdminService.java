package com.web.ecommerce.admin;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.web.ecommerce.product.ProductRepository;
import com.web.ecommerce.review.Review;
import com.web.ecommerce.review.ReviewRepository;
import com.web.ecommerce.product.Product;
import com.web.ecommerce.user.UserRepository;

@Service
public class AdminService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    UserRepository user_repo;

    @Autowired
    ReviewRepository reviewRepository;

    public String addProduct(Product product) {
        productRepository.save(product);
        return "Product added successfully";
    }

    public String removeProduct(String product_id) {

        productRepository.deleteById(product_id);
        return "Product removed successfully";
    }

    public String updateProduct(Product product) {

        productRepository.save(product);
        return "Product updated successfully";
    }


}
