package Wk5CodingAssignment;

public class AsteriskLogger implements Logger{

	static String starLine = "******************";
	static String stars = "***";
	
	@Override
	public void log(String name) {
		
		// output: ***message***
		
		System.out.println(stars + name + stars);
	}

	@Override
	public void error(String error) {
		
		/* output: 	*************
		 *			***message***
		 *			************* 
		 */
		System.out.println(starLine + "\n" + stars + "Error: " + error + stars + "\n" + starLine);
		
	}

}
