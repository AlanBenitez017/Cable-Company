
public class PhoneService extends Service{

	public PhoneService() {
		super();
	}

	public PhoneService(String type, double cost) {
		super(type, cost);
	}
	
	@Override
	public String toString() {
		return "Phone, " + this.getType() + ", " + this.getCost() + "\n";
	}

	
}
