package com.xworkz.shirt.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.shirt.entity.ShirtDTO;
import com.xworkz.shirt.service.ShirtService;

public class ShirtTester {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("application.xml","application2.xml");
		ShirtService service=container.getBean(ShirtService.class);
		ShirtDTO dto=new ShirtDTO("regular","black",600,2);
		service.saveAndValidate(dto);
	}

}
