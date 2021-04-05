package com.xworkz.washingMachine.component;

public class WashingMachine {
	private String companyName;
	private float capacity;
	private PowerComponent power;
	private MotorComponent motor;
	
	public WashingMachine() {
		System.out.println("invoked"+this.getClass().getSimpleName());
	}
	public void setCompanyName(String companyName) {
		System.out.println("invokeed setCompanyName "+companyName);
		this.companyName = companyName;
	}
	public void setCapacity(float capacity) {
		System.out.println("invokeed setcapacity "+capacity);
		this.capacity = capacity;
	}
	public void setPower(PowerComponent power) {
		System.out.println("invoked setPower: "+power);
		this.power = power;
	}
	public void setMotor(MotorComponent motor) {
		System.out.println("invokeed setmotor: "+motor);
		this.motor = motor;
	}
	public void wash() {
		System.out.println("invoked wash");
		if(power.on) {
			this.motor.rotate();
	
	}

	}

}