package com.xworkz.pgComponent.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.pgComponent.component.PGComponent;

public class PGComponentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext container=new ClassPathXmlApplicationContext("pg.xml");
		PGComponent ref=container.getBean(PGComponent.class);
		ref.serveFood();
	
	}

}
