package main;

import subclasses.Bat;

public class BatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bat bat = new Bat(); 
		
		System.out.println("Energia inicial: "+bat.displayEnergy());
		bat.attackTown();
		bat.attackTown();
		bat.attackTown();
		bat.eatHumans();
		bat.eatHumans();
		bat.fly();
		bat.fly();
		System.out.println("Energia final: "+bat.displayEnergy());
		
	}

}
