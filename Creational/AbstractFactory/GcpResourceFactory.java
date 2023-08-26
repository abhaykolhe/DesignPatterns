package Creational.AbstractFactoryMethod;

public class GcpResourceFactory implements ResourceFactory{

	@Override
	public Resource getInstance() {
		return new GcpResource();
	}

	@Override
	public Storage getStorage() {
		return new Minio();
	}

}
