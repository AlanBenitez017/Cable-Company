
public class InternetService extends Service{

	private double downloadSpeed;
	
	public InternetService() {
		super();
		downloadSpeed = 0;
	}

	public InternetService(String type, double downloadSpeed, double cost) {
		super(type, cost);
		this.downloadSpeed = downloadSpeed;
	}

	public double getDownloadSpeed() {
		return downloadSpeed;
	}

	public void setDownloadSpeed(double downloadSpeed) {
		this.downloadSpeed = downloadSpeed;
	}

	@Override
	public String toString() {
		return "Internet, " + this.getType() + ", " + this.getDownloadSpeed() + ", " + getCost() + "\n";
	}
	
	
}
