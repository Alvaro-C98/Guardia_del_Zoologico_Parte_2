package sub.classes;

import classes.Mammal;

public class Bat extends Mammal{
	
	public void fly() {
		System.out.println("*Bat acaba de despegar*");
		this.energyLevel-=50;
	}
	
	public void eatHumans() {
		System.out.println("Bueno, no importa");
		this.energyLevel+=25;
	}
	
	public void attackTown() {
		System.out.println("*La ciudad esta en llamas*");
		this.energyLevel-=100;
	}
}
