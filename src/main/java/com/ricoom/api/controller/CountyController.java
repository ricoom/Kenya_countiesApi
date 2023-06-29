package com.ricoom.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ricoom.api.models.Constituency;
import com.ricoom.api.models.County;
import com.ricoom.api.serviceimpl.CountyServiceImpl;

@RestController
@RequestMapping("api")
public class CountyController {
	
	private CountyServiceImpl countyservice;
	
@GetMapping("/counties")
public ResponseEntity<List<County>> displayCountie(){
	return new ResponseEntity<List<County>>(countyservice.getCounties(),HttpStatus.OK);
}
@GetMapping("/constituencies/{countyname}")
public ResponseEntity<List<Constituency>> displayConstituencies(@PathVariable String countyname){
	return new ResponseEntity<List<Constituency>>(countyservice.getConstituencies(countyname),HttpStatus.OK);
}
public CountyController(CountyServiceImpl countyservice) {
	this.countyservice = countyservice;
}
}
