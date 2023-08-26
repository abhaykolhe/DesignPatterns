package Creational.AbstractFactoryMethod;

public class S3Storage implements Storage{

	@Override
	public Integer size() {
		return 1000;
	}

	@Override
	public String start() {
		return "Start s3!";
	}

}
