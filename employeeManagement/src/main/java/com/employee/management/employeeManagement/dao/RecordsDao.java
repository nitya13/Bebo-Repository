package com.employee.management.employeeManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.management.employeeManagement.enteties.Records;

public interface RecordsDao extends JpaRepository<Records, String> {

}
