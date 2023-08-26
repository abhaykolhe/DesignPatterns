package Creational.AbstractFactoryMethod;

public interface ResourceFactory {
	
	public Resource getInstance();
	
	public Storage getStorage();
}
