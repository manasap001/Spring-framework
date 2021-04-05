package com.xworkz.pgComponent.component;

public class WardenComponent {
	String wardenName;
	public WardenComponent() {
		System.out.println("invoked"+this.getClass().getSimpleName());
		
	}
	public void setWardenName(String wardenName) {
		System.out.println("invoked setWardenName: "+wardenName);
		this.wardenName = wardenName;
	}
	public void arrangeFood() {
		System.out.println("food arranged");
	}

}
