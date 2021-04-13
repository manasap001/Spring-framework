package com.xworkz.kabbaditeam.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.kabbaditeam.entity.KabbadiDTO;
import com.xworkz.kabbaditeam.service.KabbadiService;

public class KabbadiTester {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("application.xml","application2.xml");
		KabbadiService service=container.getBean(KabbadiService.class);
		KabbadiDTO dto=new KabbadiDTO("MYSORE", 20, 2);
		service.saveAndValidate(dto);

	}

}
