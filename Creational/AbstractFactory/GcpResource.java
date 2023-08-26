package Creational.AbstractFactoryMethod;

public class GcpResource implements Resource{
	private Storage storage;
	
	public GcpResource() {}
	
	@Override
	public String start() {
		return "Gcp Instance start!";
	}

	@Override
	public String stop() {
		return "Gcp Instance stop!";
	}

	@Override
	public String attachStorage(Storage storage) {
		this.storage =storage;
		return this.start();
	}

	@Override
	public Storage getStorage() {
		// TODO Auto-generated method stub
		return this.storage;
	}


}
