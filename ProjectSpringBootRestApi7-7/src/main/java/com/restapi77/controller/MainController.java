package com.restapi77.controller;

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

import com.restapi77.entity.SchoolEntity;
import com.restapi77.service.Service;

@RestController
public class MainController {
	@Autowired
	private Service service;
	@PostMapping("/post")
	public ResponseEntity<String>resisterEntity(@RequestBody SchoolEntity schoolEntity){
		int i = service.rasisterInformaitn(schoolEntity);
		if (i==1) {
			return new ResponseEntity<String>("Save Success",HttpStatus.CREATED);
		}else {
			return new ResponseEntity<String>("Not Success",HttpStatus.BAD_REQUEST);
		}
		}
	@PutMapping("/put/{id}")
	public ResponseEntity<String>updateEntity(@RequestBody SchoolEntity schoolEntity,@PathVariable int id){
		try {
			service.updateInformatin(schoolEntity, id);
			return new ResponseEntity<String>("Save Success",HttpStatus.CREATED);
        }
		 catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Not Success",HttpStatus.BAD_REQUEST);
		}  	
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<SchoolEntity>>getAllData(){
		List<SchoolEntity> allData = service.getAllInformation();
		if (allData.size()<=0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
			return ResponseEntity.status(HttpStatus.CREATED).body(allData);
		
    }
		
	@GetMapping("/get{id}")
	public ResponseEntity<SchoolEntity>getById(@PathVariable int id){
		SchoolEntity byId = service.getById(id);
		return new ResponseEntity<SchoolEntity>(byId,HttpStatus.OK);
		
	}
	
	 @DeleteMapping("/delete/{id}")
	 public ResponseEntity<String>DeleteById(@PathVariable int id){
		 try {
			service.deleteById(id);
			return new ResponseEntity<String>("Delete Success",HttpStatus.CREATED); 
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Delete Not Success",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	 }
	

}
