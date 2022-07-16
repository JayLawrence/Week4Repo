package MiscProjectsPromineo;

public class AsteriskLogger implements Logger {

	
public void log(String s) {

	System.out.println("***" + s + "***");
}


public void error(String s) {
	
	int numAsterisks = 13 + s.length(); //size of asterisk 'box' for consistency in formatting
	
	for(int i = 1; i <= numAsterisks; i++) {
		System.out.print("*");
	}
	System.out.print("\n");
	
	System.out.println("***ERROR: " + s +"***");
	

	for(int i = 1; i <= numAsterisks; i++) {
		System.out.print("*");
	}
	System.out.print("\n");
}


}