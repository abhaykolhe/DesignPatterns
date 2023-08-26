package Creational.AbstractFactoryMethod;


public class Client {

	private ResourceFactory resourceFactory;
	
	public Client(ResourceFactory resourceFactory) {
		this.resourceFactory = resourceFactory;
	}
	
	public Resource createServerTypeOne(){
		//we want server to combination of resource and storage is reason to use abstract factory
		Resource instance = resourceFactory.getInstance();
		Storage storage = resourceFactory.getStorage();
		instance.attachStorage(storage);
		return instance;
	}
	
	public static void main(String[] args) {
		//aws resource
		Client aws = new Client(new AwsResourceFactory());
		Resource resource= aws.createServerTypeOne();
		System.out.println(resource.start());
		System.out.println(resource.getStorage().start());
		
		//gcp resource
		Client gcp =new Client(new GcpResourceFactory());
		Resource resource2 = gcp.createServerTypeOne();
		System.out.println(resource2.start());
		System.out.println(resource2.getStorage().start());
		
		
	}
}
