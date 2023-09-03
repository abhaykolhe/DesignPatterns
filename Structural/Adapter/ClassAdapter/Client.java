package Structural.Adapter.classadapter;

public class Client {

	public static void main(String[]args) {
		BusinessCardGenerator cardGenerator =new BusinessCardGenerator();
		Customer employeeAdapter =new EmployeeAdapter();
		String response = cardGenerator.generateCard(employeeAdapter);
		System.out.println(response);
		
	}
}
