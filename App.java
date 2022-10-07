package Wk5CodingAssignment;

/*
 * Christian M Rapp
 * Week 5 Coding Assignment
 * Object Oriented Programming
 */
public class App {

	public static void main(String[] args) {
		
		System.out.println("AsteriskLogger Output: \n");
		Logger logger1 = new AsteriskLogger();
		Logger logger2 = new SpacedLogger();
		
		logger1.log("Christian");
		System.out.println();
		logger1.error("Oops!");
		System.out.println();
		
		System.out.println("SpacedLogger Output: \n");
		logger2.log("Hello");
		System.out.println();
		logger2.error("Failed");
		

	}

}
