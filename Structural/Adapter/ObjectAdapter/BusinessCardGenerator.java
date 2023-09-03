package Structural.Adapter.objectadapter;


//target class for client with target interface customer
public class BusinessCardGenerator {

	public BusinessCardGenerator() {
		
	}
	
	public String generateCard(Customer customer) {
		return " House No: "+ customer.getHouseNumber()
		+"\n Locality : "+ customer.getAddress() + "\n City: " + customer.getCity();
	}
}
