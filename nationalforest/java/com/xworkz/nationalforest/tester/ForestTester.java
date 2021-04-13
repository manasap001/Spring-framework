package com.xworkz.nationalforest.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.nationalforest.entity.NationalForestDTO;
import com.xworkz.nationalforest.service.ForestService;

public class ForestTester {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("application.xml","application2.xml");
		ForestService service=container.getBean(ForestService.class);
		NationalForestDTO dto=new NationalForestDTO("bandipur",1974,"chamarajanagar");
		service.saveAndValidate(dto);

	}

}
