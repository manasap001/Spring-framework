package com.xworkz.application.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.application.entity.ApplicationDTO;



public class ApplicationRepositoryImpl implements ApplicationRepository {
	private SessionFactory factory;
	public ApplicationRepositoryImpl(SessionFactory factory) {
		System.out.println("invoked"+this.getClass().getSimpleName());
		this.factory=factory;
	}
	

	@Override
	public void save(ApplicationDTO entity) {
		System.out.println("invoked save FoodItemRepositoryImpl"+entity);
		
		Session session=factory.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
	

}
}
