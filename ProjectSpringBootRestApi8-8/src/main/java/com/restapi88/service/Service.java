package com.restapi88.service;

import java.util.List;

import com.restapi88.entity.Hospital;

public interface Service {
	
	public int resisterInfo(Hospital hospital);
	public List<Hospital>getAllInfo();
	public Hospital getById(int id);
	public void updateInfo(Hospital hospital,int id);
	public void deleteById(int id);

}
