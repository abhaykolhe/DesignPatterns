package Creational.FactoryMethod;

public class Client {

	public static void main(String[] args) {
		
		//Let's Suppose we wanted Tires .
		// To get Apollo Tires we went to Apollo Factory
		// To get Mrf tires we went to mrf factory
		// to get ceat tires we went to ceat factory
		//let's map getting a tire to creating an object
		
		// Create an Interface Tire
		//Implement the type of tire we want. here interface is logical 
		// Types of tires are Entity
		
		//In Factory Method instead of us creating object like in Simple Method
		//We let client decide and create the object/tires it needed.
		
		printTire(new MrfFactory());
		printTire(new CeatFactory());
	}
	
	public static void printTire(TireFactory factory) {
		Tire tire = factory.getInstance();
		System.out.println(tire.getTire());
	}

}
