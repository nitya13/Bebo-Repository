package com.employee.management.employeeManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.management.employeeManagement.enteties.Records;
import com.employee.management.employeeManagement.services.RecordsService;

@RestController
@EnableAutoConfiguration
public class ControllerClass {
	
	@Autowired
	private RecordsService recordsService;
	
	@GetMapping("/record")
	@ResponseBody
	public List<Records> getRecords(){
		
		return this.recordsService.getRecords();
	}

}
