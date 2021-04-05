package com.xworkz.washingMachine.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.washingMachine.component.WashingMachine;

public class Tester {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("washingMachine.xml");
		WashingMachine ref=container.getBean(WashingMachine.class);
		ref.wash();

	}

}
                     