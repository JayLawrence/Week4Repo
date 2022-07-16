package MiscProjectsPromineo;

public class App {
	
	
	public static void main(String Args[]) {
		
		Logger asteriskLogger1 = new AsteriskLogger();
		Logger spacedAsterisk1 = new SpacedLogger();
		
		
		asteriskLogger1.log("Hello");
		
		System.out.println("\n");
		
		asteriskLogger1.error("Hello");
		
		
		System.out.println("\n" + "\n");
		
		
		
		
		spacedAsterisk1.log("Hello");
		
		System.out.println();
		
		spacedAsterisk1.error("Hello");
	}

}
