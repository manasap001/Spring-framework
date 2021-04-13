package com.xworkz.tvchannel.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.tvchannel.entity.TVChannelDTO;
import com.xworkz.tvchannel.service.TVChannelService;

public class TVChannelTester {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("application.xml","application2.xml");
        TVChannelService service=container.getBean(TVChannelService.class);
        TVChannelDTO dto=new TVChannelDTO("Zee Kannada","kannada",2006);
        service.saveAndValidate(dto);
	}

}
