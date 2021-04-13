package com.xworkz.application.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.application.entity.ApplicationDTO;
import com.xworkz.application.service.ApplicationService;


public class ApplicationTester {

	public static void main(String[] args) {
ApplicationContext container=new ClassPathXmlApplicationContext("application.xml","application2.xml");
	
		
		
		ApplicationService service=container.getBean(ApplicationService.class);
		ApplicationDTO entity=new ApplicationDTO("asha", "mandya","B.E");
		service.saveAndValidate(entity);
		
		
	}

}
