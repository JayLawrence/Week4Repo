package MiscProjectsPromineo;

public class SpacedLogger implements Logger {
	
	
	
public  void log(String s) {

for(int i = 0; i < s.length(); i++) {
	System.out.print(s.charAt(i) + " ");
}
System.out.print("\n");
}


public void error(String s) {
	
System.out.print("ERROR:");

for(int i = 0; i < s.length(); i++) {
	System.out.print(s.charAt(i) + " ");
}
System.out.print("\n");

	
}
}
