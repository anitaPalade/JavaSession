package com.aggregationexample;

public class Main {
	public static void main(String[] args) {
		Disease d1 = new Disease("Liver Cancer", 3);
		Disease d2 = new Disease("Lung Cancer", 1);
		Patient p1 = new Patient(1,"Danny",d1);
		Patient p2 = new Patient(2,"Mukesh",d2);
		
		p1.display();
		p2.display();
	}
}
