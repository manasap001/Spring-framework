package com.xworkz.places.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.places.entity.PlaceDTO;

public class PlaceRepositoryImpl implements PlaceRepository{
	public SessionFactory factory;
	
	public PlaceRepositoryImpl(SessionFactory factory) {
		System.out.println("invoked"+this.getClass().getSimpleName());
		this.factory=factory;
	}

	@Override
	public void save(PlaceDTO dto) {
		System.out.println("invoked PlaceRepositoryImpl"+dto);
		Session session=factory.openSession();
		session.beginTransaction();
		session.save(dto);
		session.getTransaction().commit();
		session.close();
		
		
	}

}
