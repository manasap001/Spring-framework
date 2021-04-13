package com.xworkz.virus.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.virus.entity.VirusDTO;
import com.xworkz.virus.service.VirusService;

public class VirusTester {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("application.xml","application2.xml");
		VirusService service=container.getBean(VirusService.class);
		VirusDTO dto=new VirusDTO("corona virus",2020,"coronaviridae");
		service.saveAndValidate(dto);

	}

}
