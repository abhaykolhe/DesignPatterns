package Creational.AbstractFactoryMethod;

public class AwsResource implements Resource{

	private Storage storage;
	
	public AwsResource() {}
	
	@Override
	public String start() {
		return "Aws Instance Start!";
	}

	@Override
	public String stop() {
		return "Aws Instance Stop!";
	}
	@Override
	public String attachStorage(Storage storage) {
		this.storage=storage;
		return this.storage.start();
	}
	@Override
	public Storage getStorage() {
		// TODO Auto-generated method stub
		return this.storage;
	}

}
