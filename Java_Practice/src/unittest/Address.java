package unittest;

public class Address
{
	private String street;
	private String lane;
	private int zip;
	
	public Address() {}
	
	public Address(String street, String lane, int zip) {
		super();
		this.street = street;
		this.lane = lane;
		this.zip = zip;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getLane() {
		return lane;
	}

	public void setLane(String lane) {
		this.lane = lane;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}
	
	public String toString() {
		return street + " " + lane + " " + zip;
	}
		
}

