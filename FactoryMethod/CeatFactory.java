package Creational.FactoryMethod;

public class CeatFactory implements TireFactory{

	@Override
	public Tire getInstance() {
		return new Ceat();
	}
}
