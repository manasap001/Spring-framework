package com.xworkz.tvchannel.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.tvchannel.entity.TVChannelDTO;

public class TVChannelRepositoryImpl implements TVChannelRepository {
	public SessionFactory factory;
	public TVChannelRepositoryImpl(SessionFactory factory) {
		System.out.println("invoked"+this.getClass().getSimpleName());
		this.factory=factory;
	}

	@Override
	public void save(TVChannelDTO dto) {
		System.out.println("invoked TVChannelImpl"+dto);
		Session session=factory.openSession();
		session.beginTransaction();
		session.save(dto);
		session.getTransaction().commit();
		session.close();
		
		
		
	}

}
