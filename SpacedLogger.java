package Wk5CodingAssignment;

public class SpacedLogger implements Logger{

	/*
	 * Note: The following code is not the most efficient way to complete the task, but it adheres to the
	 * 		 instructions for this week's assignment. A more efficient way would be to add a separate method
	 * 		 that would format the strings 
	 * 		
	 */
	
	@Override
	public void log(String name) {
		
		// output: m e s s a g e
		
		StringBuilder strBuilder = new StringBuilder();
		
		for (int counter=0; counter < name.length(); counter ++) {
			strBuilder.append(name.charAt(counter)).append(" ");
			}
		System.out.println(strBuilder);	
		}
		

	@Override
	public void error(String error) {
		
		//output : ERROR: m e s s a g e
		
		StringBuilder strBuilder = new StringBuilder();
		
		for (int counter=0; counter < error.length(); counter ++) {
			strBuilder.append(error.charAt(counter)).append(" ");
			}
		
		System.out.println("ERROR: " + strBuilder);	
	}
}
	
	
