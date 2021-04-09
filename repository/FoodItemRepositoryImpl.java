package com.xworkz.fooddelivery.repository;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.xworkz.fooddelivery.entity.FoodItemEntity;
import com.xworkz.fooddelivery.entity.FoodType;



public class FoodItemRepositoryImpl implements FoodItemRepository {
	private SessionFactory factory;
	public FoodItemRepositoryImpl(SessionFactory factory) {
		System.out.println("invoked"+this.getClass().getSimpleName());
		this.factory=factory;
	}
	

	@Override
	public void save(FoodItemEntity entity) {
		System.out.println("invoked save FoodItemRepositoryImpl"+entity);
		
		Session session=factory.openSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(FoodItemEntity.class);
		  criteria.add(Restrictions.eq("Name", "sahana"));
		  
		  List food = criteria.list();
		  
		  for(FoodItemEntity std : FoodItemEntity)
		  {
		   System.out.println(std);
		  }
		  session.getTransaction().commit();
		  session.close();
		 }

		
		
	}


