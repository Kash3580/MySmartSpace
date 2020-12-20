package com.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Products;

public interface IProductDao extends JpaRepository<Products, Integer>{ // jpa repository type of pojo and type of primary key
 //search by product name
	// Optional<Products> findByName(String pName);
}
