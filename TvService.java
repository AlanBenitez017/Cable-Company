
public class TvService extends Service{

	public TvService() {
		super();
		
	}

	public TvService(String type, double cost) {
		super(type, cost);
		
	}

	@Override
	public String toString() {
		return "Cable, " + this.getType() + ", " + this.getCost() + "\n";
	}
	
}
