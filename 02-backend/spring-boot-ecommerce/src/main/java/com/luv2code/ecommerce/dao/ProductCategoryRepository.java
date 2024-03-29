package com.luv2code.ecommerce.dao;

import com.luv2code.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200/")

@RepositoryRestResource(collectionResourceRel = "productCategory",path = "product-category")
//                                         name of actual json entry     this is the path which i will write in url
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Long> {

}
