package Structural.Adapter.objectadapter;


//in object adapter we only implements
//to use adaptee we use Composition
public class EmployeeAdapter implements Customer{

	private EmployeeAdaptee employeeAdaptee;
	
	public EmployeeAdapter() {
		employeeAdaptee =new EmployeeAdaptee();
	}
	
	@Override
	public String getHouseNumber() {
		return employeeAdaptee.getCompleteAddress().get("housenumber");
	}

	@Override
	public String getAddress() {
		return employeeAdaptee.getCompleteAddress().get("locality");
	}

	@Override
	public String getCity() {
		return employeeAdaptee.getCompleteAddress().get("city");
	}

}
