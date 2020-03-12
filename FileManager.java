import java.util.*;
import java.io.*;

public class FileManager {

	public ArrayList<Service> readPriceListFile() throws FileNotFoundException {

		ArrayList<Service> services = new ArrayList<Service>();
		File file = new File("price-list.csv");
		Scanner inputStream = new Scanner(file);
		while (inputStream.hasNextLine()) {
			String data = inputStream.nextLine();
			String[] values = data.split(",");

			switch (values[0]) {
			case "Cable":
				for (int i = 1; i < values.length; i += 2) {
					TvService tvService = new TvService(values[i], Double.parseDouble(values[i + 1]));
					services.add(tvService);
				}
				break;

			case "Phone":
				for (int i = 1; i < values.length; i += 2) {
					PhoneService phoneService = new PhoneService(values[i], Double.parseDouble(values[i + 1]));
					services.add(phoneService);
				}
				break;
			case "Internet":
				for (int i = 1; i < values.length; i += 3) {
					InternetService internetService = new InternetService(values[i], Double.parseDouble(values[i + 1]),
							Double.parseDouble(values[i + 2]));
					services.add(internetService);
				}
				break;
			default:
				System.out.println("Invalid choice.");
			}
		}
		inputStream.close();
		return services;
	}

	public void writeCustomerTransactionFile(Customer customer) throws IOException {

		FileWriter customerFile = new FileWriter("customer_" + customer.getId() + ".txt");
		customerFile.write(customer.toString());
		customerFile.write("Selected options \n");
		for (Service service : customer.getServices()) {
			customerFile.write(service.toString());
		}
		customerFile.close();
	}

	public List<Service> readCustomerTransactionFile(int customerId) throws FileNotFoundException {

		ArrayList<Service> services = new ArrayList<Service>();
		File file = new File("customer_" + customerId + ".txt");
		Scanner inputStream = new Scanner(file);
		boolean foundServices = false;
		while (inputStream.hasNextLine()) {

			String data = inputStream.nextLine();
			if (data.contains("Selected options")) {
				foundServices = true;
			}
			if (foundServices) {
				String[] values = data.split(",");
				switch (values[0]) {
				case "Cable":
					TvService tvService = new TvService(values[1], Double.parseDouble(values[2]));
					services.add(tvService);
					break;
				case "Phone":
						PhoneService phoneService = new PhoneService(values[1], Double.parseDouble(values[2]));
						services.add(phoneService);
					break;
				case "Internet":
						InternetService internetService = new InternetService(values[1],
						Double.parseDouble(values[2]), Double.parseDouble(values[3]));
						services.add(internetService);
					break;
				default:
					System.out.println("Invalid choice.");
				}
			}
		}
		inputStream.close();
		return services;

	}

}
