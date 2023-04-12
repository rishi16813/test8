package com.restapi66.service;

import java.util.List;

import com.restapi66.entity.ProductEntity;

public interface Service {

	public int resisterData(ProductEntity productEntity);
	public List<ProductEntity>getAllData();
	public ProductEntity getById(int id);
	public void updateData(ProductEntity productEntity ,int id);
	public void deleteById(int id);
}
