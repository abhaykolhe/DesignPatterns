package Structural.Adapter.classadapter;

public class BusinessCardGenerator {
//Target Class expecting target interface of customer object

	// we have EmployeeAdaptee which has all information.
	// but we cannot use it so we create EmployeeAdapter that implement Customer and
	// extends EmployeeAdaptee

	public BusinessCardGenerator(){
		
	}
	
	public String generateCard(Customer customer) {
		return "Name : " + customer.getName() + "\n" + "Designation : " + customer.getDesignation() + "\n"
				+ "occupation : " + customer.getOccupation();
	}
}
