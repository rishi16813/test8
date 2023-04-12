package com.restapi66.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi66.entity.ProductEntity;
import com.restapi66.repository.ProductRepo;

@Service
public class ServiceImpl implements com.restapi66.service.Service {
    @Autowired
	private ProductRepo repo;

	@Override
	public int resisterData(ProductEntity productEntity) {
		ProductEntity save = repo.save(productEntity);
		if (save!=null) {
			return 1;
		}else {
			return 0;
		}
	}
	

	@Override
	public List<ProductEntity> getAllData() {
		List<ProductEntity> findAll = repo.findAll();
		return findAll;
	}

	@Override
	public ProductEntity getById(int id) {
		Optional<ProductEntity> findById = repo.findById(id);
		return findById.get();
	}

	@Override
	public void updateData(ProductEntity productEntity, int id) {
		productEntity.setId(id);
		ProductEntity save = repo.save(productEntity);
		
	}

	@Override
	public void deleteById(int id) {
	   repo.deleteById(id);
		
	}
}
