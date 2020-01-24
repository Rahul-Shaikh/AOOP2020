import java.util.Scanner;

class Show {

	static void show(int x) {
		System.out.println(x);
	}
		
	static void show(double x) { // If this function isn't there then for double there is error
		System.out.println(x);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a short and a double: ");
		
		short s = sc.nextShort();
		double d = sc.nextDouble();
		
		show(s);
		show(d);
		
	}
}
