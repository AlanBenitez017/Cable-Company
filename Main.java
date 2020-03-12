import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws InvalidateException, IOException{
		FileManager file = new FileManager();
		ArrayList<Service> services = new ArrayList<Service>();
		try {
			services = file.readPriceListFile();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}
		Scanner in = new Scanner(System.in);

        int customerId = 1;
        
        System.out.println("1. Enter a customer data and choose a service");
        System.out.println("2. Display available services");
        System.out.println("3. Search for a customer transaction");
        System.out.println("0. Quit");
        
        boolean quit = false;
        int menuItem;
        do {
              System.out.print("Choose menu item: ");
              menuItem = in.nextInt();
              switch (menuItem) {
              case 1:    
            	  	String customerName;
            	  	String phoneNumber;
            	  	String street;
            	  	String city;
            	  	String state;
            	  	String zipCode;
                    System.out.println("You've chosen to enter a customer");
                    System.out.println("Enter a customer name: ");
                    customerName = in.next();
                    System.out.println(customerName);
                    System.out.println("Enter a phone number in the format (xxx) xxx-xxxx: ");
                    phoneNumber = in.nextLine();
                    System.out.println(phoneNumber);
                    System.out.println("Now we will get your address");
                    System.out.print("Street: ");
                    street = in.next();
                    System.out.println(street);
                    System.out.print("City: ");
                    city = in.next();
                    System.out.println(city);
                    System.out.print("State: ");
                    state = in.next();
                    System.out.println(state);
                    System.out.print("Zip Code (must be 5 numbers): ");
                    zipCode = in.next();
                    System.out.println(zipCode);
                    
                    Address address1 = new Address(street, city, state, zipCode);
                    Customer cust1 = new Customer(customerId, customerName, phoneNumber, address1, services);
                    
                    Customer.validatePhoneNumber(phoneNumber);
                    Address.validateZipCode(zipCode);
                    
                    break;
              case 2:
                    System.out.println("You've chosen to display available services");
                    for(Service service : services) {
                    	System.out.println(service.toString());
                    }
                    break;
              case 3:
            	  	System.out.println("You've chosen to search for a customer transaction");
            	  	System.out.println("Please insert your customerId");
            	  	customerId = in.nextInt();
            	  	file.readCustomerTransactionFile(customerId);
            	  
                    break;            
              case 0:
                    quit = true;
                    break;
              default:
                    System.out.println("Invalid choice.");
              }
        } while (!quit);
        System.out.println("Thank you very much for your transaction");
	}

}
