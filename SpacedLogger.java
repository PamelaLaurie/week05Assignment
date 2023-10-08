package week05Assignment;

//Create SpacedLogger Class
public class SpacedLogger implements Logger {

//implement the Spacedlogger methods
	
	//log method should print String with spaces between letters
	@Override
	public void log(String log) {
		for (int i = 0; i < log.length(); i++) {
			if (i < log.length() - 1) {
				System.out.print(log.charAt(i) + " ");
			}else
				System.out.println(log.charAt(i) + "\n");
		}
		
		
	}
	//error method should print the same as log method but preceded with "Error:" - all set to print on same line
	@Override
	public void error(String error) {
		System.out.print("ERROR: ");
		for (int i = 0; i < error.length(); i++) {
			if (i < error.length() - 1) {
				System.out.print(error.charAt(i) + " ");
			}else
				System.out.println(error.charAt(i) + "\n");
		}
		
		//same output but using StringBuildier
		StringBuilder spaceString = new StringBuilder();
		spaceString.append("ERROR: ");
		for (int i = 0; i < error.length(); i++) {
			if (i < error.length()-1) {
				spaceString.append(error.charAt(i) + " "); 
			}else
				spaceString.append(error.charAt(i));
		}
		System.out.println(spaceString.toString());
	}	
		
}
