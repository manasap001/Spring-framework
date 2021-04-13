package com.xworkz.monuments.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.monuments.entity.MonumentDTO;

public class MonumentRepositoryImpl implements MonumentRepository {
	SessionFactory factory;
	public MonumentRepositoryImpl(SessionFactory factory) {
		System.out.println("invoked"+this.getClass().getSimpleName());
		this.factory=factory;
		
	}

	@Override
	public void save(MonumentDTO dto) {
		System.out.println("invoked MonumentRepositoryImpl"+dto);
		Session session=factory.openSession();
		session.beginTransaction();
		session.save(dto);
		session.getTransaction().commit();
		session.close();
		
	}
	

}
