package com.technicalkeeda.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.technicalkeeda.dao.EmployeeDao;
import com.technicalkeeda.entities.Employee;

public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"config/spring-configuration.xml");

		Employee employee = new Employee();
		employee.setFirstName("Yashwant");
		employee.setLastName("Chavan");
		employee.setEmail("yashwant.*****@gmail.com");

		EmployeeDao employeeDao = (EmployeeDao) appContext.getBean("employeeDao");
		employeeDao.createEmployee(employee);
		
	}
}