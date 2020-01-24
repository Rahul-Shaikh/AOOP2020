import java.util.Scanner;

class Metric {
	public static void main(String[] args) {
		Conversion.choice();
	}
}

class Conversion {
	private static Scanner psc = new Scanner(System.in);
	
	private static void KmToMile() {
		System.out.print("\nENTER VALUE IN KM: ");
		double km = psc.nextDouble();
		System.out.println("\nTHE VALUE IN MILE: " + km/1.60934);
	}
	
	private static void MileToKm() {
		System.out.print("\nENTER VALUE IN MILE: ");
		double mile = psc.nextDouble();
		System.out.println("\nTHE VALUE IN KM: " + mile*1.60934);
	}
		 
	static void choice() {
		while (true) {
			System.out.println("\n\n----------------------------------------------------");
			System.out.println("1. ENTER 1 TO CONVERT KILOMETER TO MILE");
			System.out.println("2. ENTER 2 TO CONVERT MILE TO KILOMETER");
			System.out.println("3. ENTER 0 TO EXIT");
			System.out.println("----------------------------------------------------\n\n");
			System.out.print("ENTER YOUR CHOICE: ");
			int in = psc.nextInt();

			if (in == 1) KmToMile();
			else if (in == 2) MileToKm();
			else if(in == 0) break;
			else System.out.println("INPUT ERROR\n\n");
		}
	}
}
