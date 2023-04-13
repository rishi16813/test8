package com.restapi77.service;

import java.util.List;

import com.restapi77.entity.SchoolEntity;

public interface Service {
	
	public int rasisterInformaitn(SchoolEntity schoolEntity);
	public List<SchoolEntity>getAllInformation();
	public SchoolEntity getById(int id);
	public void updateInformatin(SchoolEntity schoolEntity ,int id);
	public void deleteById(int id);

}
