package com.xworkz.fooddelivery.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.fooddelivery.entity.HotelVendorEntity;

public class HotelVendorRepositoryImpl implements HotelVendorRepository {
	private SessionFactory factory;
	public HotelVendorRepositoryImpl(SessionFactory factory){
		System.out.println("invoked "+this.getClass().getSimpleName());
		this.factory=factory;
		
	}

	@Override
	public void save(HotelVendorEntity entity) {
		System.out.println("invoked save: "+entity);
		
		
		Session session=factory.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
		
		
		
	}
	
	

}
