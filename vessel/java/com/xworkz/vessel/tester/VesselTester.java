package com.xworkz.vessel.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.vessel.entity.VesselDTO;
import com.xworkz.vessel.service.VesselService;

public class VesselTester {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("application.xml","application2.xml");
		VesselService service=container.getBean(VesselService.class);
		VesselDTO dto=new VesselDTO("Brahmaputra","frigate","INS Brahmaputra");
		service.saveAndValidate(dto);
		

	}

}
