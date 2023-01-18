package com.zensar.careersolutionswebservice.controllers;

public class Data {

	private int number;
	private String name;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Data(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

	public Data() {
		super();
	}

	@Override
	public String toString() {
		return "Data [number=" + number + ", name=" + name + "]";
	}

}
