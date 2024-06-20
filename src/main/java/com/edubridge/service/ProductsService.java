package com.edubridge.service;

import java.util.List;

import com.edubridge.model.Products;


public interface ProductsService 
{
	List<Products> getAllProducts();
	Products getProducts(Integer productid);
	void createProducts(Integer productid,String title,Integer price);
	void updateProducts(Integer productid,String title,Integer price);
	void deleteProducts(Integer productid);
}
