package com.employee.management.employeeManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.employee.management.employeeManagement.controller.ControllerClass;


@SpringBootApplication
@Configuration
@ComponentScan(basePackages={"com.employee.management.employeeManagement.services.RecordsService"})
//@ComponentScan(basePackageClasses=ControllerClass.class)
public class EmployeeManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}

}
