package com.restapi77.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi77.entity.SchoolEntity;
import com.restapi77.repository.SchoolRepo;

@Service
public class ServiceImpl implements com.restapi77.service.Service {
	@Autowired
	private SchoolRepo repo;

	@Override
	public int rasisterInformaitn(SchoolEntity schoolEntity) {
		SchoolEntity save = repo.save(schoolEntity);
		if (save!=null) {
			return 1;
		}else {
			return 0;
		}
	}

	@Override
	public List<SchoolEntity> getAllInformation() {
		List<SchoolEntity> findAll = repo.findAll();
		return findAll;
	}

	@Override
	public SchoolEntity getById(int id) {
		Optional<SchoolEntity> findById = repo.findById(id);
		return findById.get();
	}

	@Override
	public void updateInformatin(SchoolEntity schoolEntity, int id) {
		schoolEntity.setId(id);
		SchoolEntity save = repo.save(schoolEntity);
		
	}

	@Override
	public void deleteById(int id) {
		repo.deleteById(id);
		
	}

}
