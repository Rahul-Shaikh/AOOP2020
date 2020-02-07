import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ENTER INTEGER: ");
		int n = sc.nextInt();
		
		Integer nobj = new Integer(n); // basic type to object
		int ncpy = nobj; // object to basic type;
		
		System.out.println("YOU HAVE ENTERED " + Integer.toString(ncpy)); // basic type to string
		System.out.println("YOU HAVE " + nobj.toString()); // object to string
		
		String val = "16";
		int i1 = Integer.parseInt(val); // from integer to value
		int i2 = Integer.parseInt(val, 16);
		System.out.println("FOR DECIMAL: " + i1 + "\nFOR HEXADECIMAL: " + i2);
	}
}
