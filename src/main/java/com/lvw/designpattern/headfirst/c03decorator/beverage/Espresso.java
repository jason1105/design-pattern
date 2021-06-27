package com.lvw.designpattern.headfirst.c03decorator.beverage;

public class Espresso extends Beverage {

	private String description;

	public Espresso() {
		description = "Espresso";
	}

	@Override
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double cost() {
		return 1.99;
	}
}

