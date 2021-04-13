package com.xworkz.nationalforest.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.nationalforest.entity.NationalForestDTO;

public class ForestRepositoryImpl implements ForestRepository {
	public SessionFactory factory;
	public ForestRepositoryImpl(SessionFactory factory) {
		System.out.println("invoked"+this.getClass().getSimpleName());
		this.factory=factory;
	}

	@Override
	public void save(NationalForestDTO dto) {
		System.out.println("invoked ForestRepositoryImpl"+dto);
		Session session=factory.openSession();
		session.beginTransaction();
		session.save(dto);
		session.getTransaction().commit();
		session.close();
		
		
	}

}
