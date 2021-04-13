package com.xworkz.kabbaditeam.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.kabbaditeam.entity.KabbadiDTO;

public class KabbadiRepositoryImpl implements KabbadiRepository {
	public SessionFactory factory;
	public KabbadiRepositoryImpl(SessionFactory factory) {
		System.out.println("invoked"+this.getClass().getSimpleName());
		this.factory=factory;
	}

	@Override
	public void save(KabbadiDTO dto) {
		System.out.println("invoked KabbadiRepositoryImpl"+dto);
		Session session=factory.openSession();
		session.beginTransaction();
		session.save(dto);
		session.getTransaction().commit();
		session.close();
		
	}

}
