package com.xworkz.monuments.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.monuments.entity.MonumentDTO;
import com.xworkz.monuments.service.MonumentService;
import com.xworkz.monuments.service.MonumentServiceImpl;


public class MonumentTester {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("application.xml","application2.xml");
		MonumentService service=container.getBean(MonumentService.class);
		MonumentDTO dto=new MonumentDTO("hampi","october",40);
		service.saveAndValidate(dto);
		}

}
