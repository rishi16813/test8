package com.restapi88.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi88.entity.Hospital;
import com.restapi88.service.Service;

@RestController
public class MainController {
  @Autowired
	private Service service;
  @PostMapping("/post")
  public ResponseEntity<String>resisterEntity(@RequestBody Hospital hospital){
	     int resisterInfo = service.resisterInfo(hospital);
	     if (resisterInfo==1) {
			return new ResponseEntity<String>("save success",HttpStatus.CREATED);
		}else {
			return new ResponseEntity<String>("not save",HttpStatus.BAD_REQUEST);
		}
  }
  
  @PutMapping("/put/{id}")
  public ResponseEntity<String>updateEntity(@RequestBody Hospital hospital,@PathVariable int id){
	  try {
		  service.updateInfo(hospital, id);
		  return new ResponseEntity<String>("save success update",HttpStatus.CREATED);
	} catch (Exception e) {
		e.printStackTrace();
		return new ResponseEntity<String>("not update",HttpStatus.BAD_REQUEST);
	}
	 
  }
  
  @GetMapping("/getalldata")
  public ResponseEntity<List<Hospital>>getAllData(){
	  List<Hospital> allInfo = service.getAllInfo();
	  if (allInfo.size()<=0) {
		  return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		
	}else {
		return ResponseEntity.status(HttpStatus.CREATED).body(allInfo);
	}
  }
  @GetMapping("/get/{id}")
  public ResponseEntity<Hospital>getById(@PathVariable int id ){
	  Hospital byId = service.getById(id);
	return new ResponseEntity<Hospital>(byId,HttpStatus.OK);
  }
  
  @DeleteMapping("/delete/{id}")
  public ResponseEntity<String>deleteById(@PathVariable int id){
	 try {
		service.deleteById(id);
		return new  ResponseEntity<String>("Delete Success",HttpStatus.CREATED);
	} catch (Exception e) {
		e.printStackTrace();
		return new ResponseEntity<String>("Not Deleted",HttpStatus.BAD_REQUEST);
	}
	  
  }
  
}
