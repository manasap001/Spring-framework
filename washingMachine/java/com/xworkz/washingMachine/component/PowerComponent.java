package com.xworkz.washingMachine.component;

public class PowerComponent {
	public boolean on;
	public PowerComponent() {
		System.out.println("invoked"+this.getClass().getSimpleName());
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	

}
