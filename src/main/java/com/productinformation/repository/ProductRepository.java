
package com.productinformation.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.productinformation.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}