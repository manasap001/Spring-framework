package com.xworkz.shirt.respository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.shirt.entity.ShirtDTO;

public class ShirtRepositoryImpl implements ShirtRepository {
	public SessionFactory factory;
	public ShirtRepositoryImpl(SessionFactory factory) {
		System.out.println("invoked"+this.getClass().getSimpleName());
		this.factory=factory;
	}

	@Override
	public void save(ShirtDTO dto) {
		System.out.println("invoked ShirtRepositoryImpl"+dto);
		Session session=factory.openSession();
		session.beginTransaction();
		session.save(dto);
		session.getTransaction().commit();
		session.close();
		
		
	}

}
