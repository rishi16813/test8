package com.restapi88.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi88.entity.Hospital;
import com.restapi88.repository.HospitalRepo;

@Service
public class ServiceImpl implements com.restapi88.service.Service {
	@Autowired
	private HospitalRepo repo;

	@Override
	public int resisterInfo(Hospital hospital) {
		Hospital save = repo.save(hospital);
		if (save!=null) {
			return 1;
		}else {
			return 0;
		}	
	}

	@Override
	public List<Hospital> getAllInfo() {
		List<Hospital> findAll = repo.findAll();
		return findAll;
	}

	@Override
	public Hospital getById(int id) {
	Optional<Hospital> findById = repo.findById(id);
		return findById.get();
	}

	@Override
	public void updateInfo(Hospital hospital, int id) {
		hospital.getId();
		Hospital save = repo.save(hospital);	
	}
	
	@Override
	public void deleteById(int id) {
		repo.deleteById(id);
		
	}
}
