package Structural.Adapter.objectadapter;

public class Client {

	public static void main(String[] args) {
		BusinessCardGenerator businessCardGenerator =new BusinessCardGenerator();
		Customer customer =new EmployeeAdapter();
		String response= businessCardGenerator.generateCard(customer);
		System.out.println(response);
	}

}
