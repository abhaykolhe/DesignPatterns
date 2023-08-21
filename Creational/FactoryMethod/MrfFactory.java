package Creational.FactoryMethod;

public class MrfFactory implements TireFactory{

	public Tire getInstance() {
		return new Mrf();
	}
}
