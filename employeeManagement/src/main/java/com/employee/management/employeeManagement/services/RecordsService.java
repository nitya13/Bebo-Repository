package com.employee.management.employeeManagement.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.employee.management.employeeManagement.enteties.Records;

	@Service
	@Component("RecordServiceImpl")
	@Transactional
	public interface RecordsService {
		
		public List<Records> getRecords();
}
