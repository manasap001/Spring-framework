package com.xworkz.virus.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.virus.entity.VirusDTO;

public class VirusRepositoryImpl implements VirusRepository {
	public SessionFactory factory;
	public VirusRepositoryImpl(SessionFactory factory) {
		System.out.println("invoked"+this.getClass().getSimpleName());
		this.factory=factory;
	}

	@Override
	public void save(VirusDTO dto) {
	System.out.println("invoked virusRepositoryImpl"+dto);
	Session session=factory.openSession();
	session.beginTransaction();
	session.save(dto);
	session.getTransaction().commit();
	session.close();
	
		
	}

}
