package Structural.Adapter.classadapter;

//we have to extends first and then implement

public class EmployeeAdapter extends EmployeeAdaptee implements Customer{

	@Override
	public String getName() {
		return this.getFullName();
	}

	@Override
	public String getDesignation() {
		return this.getSalutation();
	}

	@Override
	public String getOccupation() {
		return this.getProfession();
	}

}
