package com.technicalkeeda.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.technicalkeeda.dao.EmployeeDao;
import com.technicalkeeda.entities.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private HibernateTemplate hibernateTemplate;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	@Override
	public void createEmployee(Employee employee) {
		hibernateTemplate.saveOrUpdate(employee);
	}

}