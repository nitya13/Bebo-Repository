package com.employee.management.employeeManagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.employee.management.employeeManagement.dao.RecordsDao;
import com.employee.management.employeeManagement.enteties.Records;


public class RecordServiceImpl implements RecordsService {

	@Autowired
	private RecordsDao recordsDao;
	
	@Override
	public List<Records> getRecords() {

		return recordsDao.findAll();
	}
}
