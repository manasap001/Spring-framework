package com.xworkz.fooddelivery.repository;


import org.hibernate.Session;
import org.hibernate.cfg.Configuration;


import com.xworkz.fooddelivery.entity.FoodItemEntity;

public class FoodItemRepositoryImpl implements FoodItemRepository {
	public FoodItemRepositoryImpl() {
		System.out.println("invoked"+this.getClass().getSimpleName());
	}
	

	@Override
	public void save(FoodItemEntity entity) {
		System.out.println("invoked save FoodItemRepositoryImpl"+entity);
		
		Configuration cfg=new Configuration();
		cfg.configure();
		org.hibernate.SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
		factory.close();
		
		
		
	}

}
