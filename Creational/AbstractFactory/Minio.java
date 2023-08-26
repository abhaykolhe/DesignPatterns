package Creational.AbstractFactoryMethod;

public class Minio implements Storage{

	public Minio() {}
	
	@Override
	public Integer size() {
		return 200;
	}

	@Override
	public String start() {
		return "Start Minio!";
	}

}
