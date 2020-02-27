package com.single;


class Chair extends Furniture{ //Chair is a-furniture... 
	int legs;
	void setLegs(int val){
		legs = val;
	}
		int getLegs(){
		return legs;
	}

	void displayChair(){
		System.out.println("Legs :"+getLegs());
		System.out.println("Cost : "+getCost());
	}

}
