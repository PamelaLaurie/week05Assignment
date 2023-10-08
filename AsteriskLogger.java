package week05Assignment;

//Create AsteriskLogger Class
public class AsteriskLogger implements Logger {

//Implement AsteriskLogger methods
	
	//log method should print String with 3 asterisks on each side
	@Override
	public void log(String log) {
		System.out.println("***" + log + "***\n");
		
	}
	//error method should print the String inside a box of asterisks with the String preceded by "ERROR:"
	@Override
	public void error(String error) {
		System.out.println("***********************");
		System.out.println("*** ERROR: " + error + "***");
		System.out.println("***********************\n");
		
	}

}
