package com.aggregationexample;

public class Disease {
	private String name;
	private int level;
	
	public Disease(String name, int level) {
		this.name = name;
		this.level = level;
	}
	
	public String getName() {
		return name;
	}
	
	public int getLevel() {
		return level;
	}
	
}
