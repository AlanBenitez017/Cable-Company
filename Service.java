
public class Service {

	private String type;
	private double cost;
	
	public Service(){
		type = null;
		cost = -1;
	}
	
	public Service(String type, double cost) {
		this.type = type;
		this.cost = cost;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Service: " + this.getType() + "Cost: " + this.getCost();
	}
	
	
	
}
