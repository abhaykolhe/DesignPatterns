package Structural.Adapter.objectadapter;

import java.util.HashMap;
import java.util.Map;

//adaptee class with all details
public class EmployeeAdaptee {

	public EmployeeAdaptee() {
		
	}
	
	public Map<String,String> getCompleteAddress(){
		Map<String,String> address =new HashMap<>();
		address.put("housenumber", "23");
		address.put("locality", "delhi road");
		address.put("city", "Delhi");
		return address;
	}
	
}
