# Cable Company

## Project Outcomes:
Develop a Java program that uses:
- Exception handling
- File Processing(text)
- Regular Expressions

## Preparatory Readings:
- ZyBooks chapters 1-10
- Regular Expression in Java (https://docs.oracle.com/javase/tutorial/essential/regex/).

## Project Overview:
Create a Java program that simulates a cable company and allows user to pick a TV, Internet and Phone and show the cost.
In this program the design is left up to the programmer.
However, good object-oriented design is required.

## Project Requirements
1. Develop a text based menu driven program that calculates cable company package costs.
Here is a link to an example of a text based menu (http://www.javaforstudents.co.uk/Code_snippets/Switch-operated_text_menu).
1. The cable provider has the following TV monthly options:
	1. Basic, $24.99
	1. Premium, $45.99
	1. Platinum, $79.99
1. The cable provider has the following internet service options:
	1. Essential, 30Mbps, $39.95
	1. Preferred, 100Mbps.  $59.95
	1. Ultimate, 300Mbps, $79.95
2. The cable provider has the following phone services options:
	1. Basic, $19.99
	1. Supreme, $39.99
1. Customer Information must include: customer's name, address (street, city, state, zip), phone number, and a unique customer ID number.
1. Regular Expressions
	1. Zip code input should only be **5 digits**.
	1. Phone numbers must be in the form (xxx) xxx-xxxx.
	1. Must use regular expressions to test the zip code and phone number.
	1. Use user defined exceptions that will require the user to enter zip or phone in correct format before continuing.
	1. Handle all checked exceptions robustly.
	The program should not exit or crash if an exception is encountered.
1. The cable company needs the ability to change their plan names and prices often so they want the application to be flexible.
	1. The application will read all the TV, Internet and Phone options from a text file.
	This includes: TV - type and cost; Internet - type, download speed, and cost; and Phone - type and cost.
	1. When the program starts up, it should load in the current option from the file _price-list.csv_.
	1. The input file is a comma delimited file with the following structure (See _price-list.csv_ for an example.
	The sample file has a header that should be accounted for when processing and is structured as follows:
		1. line one lists the TV options type and cost
		1. line two lists the Internet options type, download speed, and cost
		1. line three lists the Phone options type and cost.
	1. The sample file format **must be followed** as the graders will use a file in this format to test your program.
	1. Write all completed transaction data to a text file named cutomer_ID.txt, where ID should be replaced with the unique customer ID.
	For example, a customer who is assigned ID 1001 would have their transaction details in a file called customer_1001.txt.
	The output file format is up to you as the developer, but it should be easy to read.
	The data should include customer ID number, total cost per month and a breakdown of each of the services cost (ie cost of TV, Internet and Phone).
6. A menu option is neeeded to search for the transaction file for a transaction based on customer ID number.
A successful seaech should print out the transaction information.
Assume only one transaction per customer ID.
7. The remaining design details are left up to you, including: how to structure the application, how many classes to develop, and the interrelationship of those classes.
Use the techniques you've learned in this course, including **good object-oriented design**.
8. Create a UML Class Diagram for initial design of this project.
    - This can be done using any software tool you please, or can be a cell phone picture of a drawing on a sheet of paper.
    - The emphasis is on planning. You should try to think about the full scope of the program before you start writing tests and code.
    - The class diagrams should include
      - Access specifier (- or +).
      - All instance fields with type.
      - All methods with return type and parameter types.
      - Associations, Generalization (Inheritance) and Aggregation and Multiplicity
      - Stereotyping - Interface or Abstract Classes.
  4. No need to include the class with main method in the UML diagrams.

#### Sample data
```
Cable,Basic,24.99,Premium,45.99,Platinum,79.99
Internet,Essential,30,39.95,Preferred,100,59.95,Ultimate,300,79.95
Phone,Basic,19.99,Supreme,39.99
```

### Implementation Notes:
1. Create a project that is object oriented, therefore there should be several classes.
1. The input file will match the exact format given above.

### Submission Requirements:
1. All code must be added and committed to your local git repository.
1. All code must be pushed to the GitHub repository created when you "accepted" the assignment.
	1. After pushing, with `git push origin master`, visit the web URL of your repository to verify that your code is there.
	If you don't see the code there, then we can't see it either.
1. If your program will not compile, the graders will not be responsible for trying to test it.

## Important Notes:
* Projects will be graded on whether they correctly solve the problem, and whether they adhere to good programming practices.
* Projects must be received by the time specified on the due date. Projects received after that time will get a grade of zero.
* Please review the academic honesty policy.
	* Note that viewing another student's solution, whether in whole or in part, is considered academic dishonesty.
	* Also note that submitting code obtained through the Internet or other sources, whether in whole or in part, is considered academic dishonesty.
	* All programs submitted will be reviewed for evidence of academic dishonesty, and all violations will be handled accordingly.
