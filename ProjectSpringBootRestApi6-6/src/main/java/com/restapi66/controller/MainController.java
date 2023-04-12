package com.restapi66.controller;

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

import com.restapi66.entity.ProductEntity;
import com.restapi66.service.Service;

@RestController
public class MainController {
    @Autowired
	private Service service;
    @PostMapping("/post")
    public ResponseEntity<String>addProduct(@RequestBody ProductEntity productEntity){
    	int i = service.resisterData(productEntity);
    	if (i==1) {
			return new ResponseEntity<String>("Save Success",HttpStatus.CREATED);
		}else {
			return new ResponseEntity<String>("Not Success",HttpStatus.BAD_REQUEST);
		}
    }
    
    @PutMapping("/put/{id}")
    public ResponseEntity<String>updateProduct(@RequestBody ProductEntity productEntity,
    		@PathVariable int id){
    	try {
			this.service.updateData(productEntity, id);
			return new ResponseEntity<String>("Save Success",HttpStatus.CREATED);
        }
		 catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Not Success",HttpStatus.BAD_REQUEST);
		}  	
}
     @GetMapping("/getall")
    public ResponseEntity<List<ProductEntity>>getAllData(){
    	List<ProductEntity> allData = service.getAllData();
    	if (allData.size()<=0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
			return ResponseEntity.status(HttpStatus.CREATED).body(allData);
		
    }
     
     @GetMapping("/get/{id}")
     public ResponseEntity<ProductEntity>getById(@PathVariable int id){
    	 ProductEntity byId = service.getById(id);
    	 return new ResponseEntity<ProductEntity>(byId,HttpStatus.OK);
     }
     @DeleteMapping("/delete/{id}")
     public ResponseEntity<String>deleteById(@PathVariable int id){
    	 try {
			service.deleteById(id);
			return new ResponseEntity<String>("Delete Success",HttpStatus.CREATED); 
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Delete Not Success",HttpStatus.INTERNAL_SERVER_ERROR);
		}
     }
}