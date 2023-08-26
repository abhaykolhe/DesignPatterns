package Creational.AbstractFactoryMethod;

public class AwsResourceFactory implements ResourceFactory{

	@Override
	public Resource getInstance() {
		return new AwsResource();
	}

	@Override
	public Storage getStorage() {
		return new S3Storage();
	}

}
