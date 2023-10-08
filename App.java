package week05Assignment;

//Create a class with main method
public class App {

	public static void main(String[] args) {
		String test = "CHAMPAGNE";
		
		//instantiate asteriskLogger Class
		Logger asteriskLogger = new AsteriskLogger();
		//test log and error methods
		asteriskLogger.log(test);
		asteriskLogger.error(test);
		
		//instantiate SpacedLogger Class
		Logger spacedLogger = new SpacedLogger();
		//test log and error methods
		spacedLogger.log(test);
		spacedLogger.error(test);
		
	}

}
