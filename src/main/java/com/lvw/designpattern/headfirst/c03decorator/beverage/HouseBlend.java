package com.lvw.designpattern.headfirst.c03decorator.beverage;

public class HouseBlend extends Beverage {
	private String description;

	public HouseBlend() {
		description = "House Blend Coffee";
	}

	@Override
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double cost() {
		return .89;
	}
}

