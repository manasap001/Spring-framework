package com.xworkz.vessel.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.vessel.entity.VesselDTO;

public class VesselRepositoryImpl implements VesselRepository{
	public SessionFactory factory;
	public VesselRepositoryImpl(SessionFactory factory) {
		System.out.println("invoked"+this.getClass().getSimpleName());
		this.factory=factory;
	
	}

	@Override
	public void save(VesselDTO dto) {
		System.out.println("invoked VesselRepositoryImpl"+dto);
		Session session=factory.openSession();
		session.beginTransaction();
		session.save(dto);
		session.getTransaction().commit();
		session.close();
	}

}
