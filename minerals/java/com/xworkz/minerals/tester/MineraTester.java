package com.xworkz.minerals.tester;

import org.hibernate.service.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.minerals.entity.MineralDTO;
import com.xworkz.minerals.service.MineralService;

public class MineraTester {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("application.xml","application2.xml");
		MineralService service=container.getBean(MineralService.class);
		MineralDTO dto=new MineralDTO("PURPLE","CUBIC","1");
		service.saveAndValidate(dto);
		
	}

} 
