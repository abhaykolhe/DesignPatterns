package Creational.AbstractFactoryMethod;

public interface Resource {

	public String start();
	
	public String stop();
	
	public String attachStorage(Storage storage);
	
	public Storage getStorage();
	
}
