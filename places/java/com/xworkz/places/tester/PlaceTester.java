package com.xworkz.places.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.places.entity.PlaceDTO;
import com.xworkz.places.service.PlaceService;
import com.xworkz.places.service.PlaceServiceImpl;

public class PlaceTester {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("application.xml","application2.xml");
		PlaceService service=container.getBean(PlaceService.class);
		PlaceDTO dto=new PlaceDTO("mysorepalace","mysore",5);
		service.saveAndValidate(dto);

	}

}
