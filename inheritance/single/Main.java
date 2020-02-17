package com.single;

public class Main {
	public static void main(String[] args) {
		
		Chair c1 = new Chair();
		Chair c2 = new Chair();
		c1.setCost(100);
		c1.setLegs(4);
		c1.displayChair();
		c2.setCost(150);
		c2.setLegs(3);
		System.out.println("chair 2");
		System.out.println("Cost :"+c2.getCost());
		System.out.println("Legs :"+c2.getLegs());
	}
}
