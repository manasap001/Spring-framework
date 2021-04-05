package com.xworkz.washingMachine.component;

public class MotorComponent {
	private int warrantyPeriod;
	public MotorComponent() {
		System.out.println("invoked"+this.getClass().getSimpleName());
	}
	public void setWarrantyPeriod(int warrantyPeriod) {
		System.out.println("invoked setWarrantyPeriod: "+warrantyPeriod);
		this.warrantyPeriod = warrantyPeriod;
	}
	public void rotate() {
		System.out.println("motor rotating");
	}

}
