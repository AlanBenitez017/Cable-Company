import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer {

	private int id;
	private String name;
	private String phoneNumber;
	Address address = new Address();
	ArrayList<Service> services = new ArrayList<Service>();
	
	
	public Customer() {
		id = 0000;
		name = "<noname>";
		phoneNumber = "(000) 000-0000";		
	}
	
	public Customer(int id, String name, String phoneNumber, Address address, ArrayList<Service> services) {
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.services = services;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public ArrayList<Service> getServices() {
		return services;
	}
	public void setServices(ArrayList<Service> services) {
		this.services = services;
	}
	
	public static void validatePhoneNumber(String phoneNumber) throws InvalidateException {
     String regex = "\\(\\d{3}\\)\\s\\d{3}-\\d{4}$";
     Pattern pattern = Pattern.compile(regex);
     Matcher matcher = pattern.matcher(phoneNumber);
     if(!(matcher.matches())) {
			throw new InvalidateException("Invalid phone number, ");
     }
     
   }

	@Override
	public String toString() {
		return "CustomerId" + this.getId() + ", Name: " + this.getName() +
				"PhoneNumber: " + this.getPhoneNumber() +
				"\n Address: " + getAddress().toString() + "\n";
	}
	


	
}
