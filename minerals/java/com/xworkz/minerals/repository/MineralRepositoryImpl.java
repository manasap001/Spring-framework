package com.xworkz.minerals.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.minerals.entity.MineralDTO;


public class MineralRepositoryImpl implements MineralRepository{
	SessionFactory factory;
	public MineralRepositoryImpl(SessionFactory factory) {
		System.out.println("invoked"+this.getClass().getSimpleName());
		this.factory=factory;
		
	}

	@Override
	public void save(MineralDTO dto) {
		System.out.println("invoked MonumentRepositoryImpl"+dto);
		Session session=factory.openSession();
		session.beginTransaction();
		session.save(dto);
		session.getTransaction().commit();
		session.close();
		
			
		}
		
	}


