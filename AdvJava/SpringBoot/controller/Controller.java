package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Employee;
import com.service.Services;

@RestController
@RequestMapping("emp")  //http://localhost:9283/emp
public class Controller {

	@Autowired
	Services service;
	
	@PostMapping("/add") //http://localhost:9283/emp/add
	public String insert(@RequestBody Employee emp) {
		return service.addEmp(emp);
	}
	
	@PutMapping("/update") //http://localhost:9283/emp/update
	public String update(@RequestBody Employee emp) {
	
		return service.updateEmp(emp);}
	
	@DeleteMapping("/delete/{eid}") //http://localhost:9283/emp/delete
	public String delete(@PathVariable("eid") int empId){
		return service.deleteEmp(empId);
	}
	
	@GetMapping("/get/{eid}")//http://localhost:9283/emp/get
	public Employee getEmp(@PathVariable("eid") int empId){
		return service.getEmp(empId);
	}
}
