package com.lvw.designpattern.headfirst.c03decorator.beverage;

public class Decaf extends Beverage {
	private String description;

	public Decaf() {
		description = "Decaf Coffee";
	}

	@Override
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double cost() {
		return 1.05;
	}
}

