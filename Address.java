package phoneBookApplication;

public class Address {
	private String streetName;
	private String City;
	private String State;
	private String zipCode;
	
	
	public Address() {
		super();
	}
	public Address(String streetName, String City, String State, String zipCode) {
		super();
		this.streetName = streetName;
		this.City = City;
		this.State = State;
		this.zipCode = zipCode;
	}
	
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	
	public String getCity() {
		return City;
	}
	public void setCity(String City) {
		this.City = City;
	}
	
	
	public String getState() {
		return State;
	}
	public void setState(String State) {
		this.State = State;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	@Override
	public String toString() {
		return streetName + " " + City + ", " + State + " " + zipCode;
	}
	
	
	
	
}
