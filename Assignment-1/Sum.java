import java.util.Scanner;

class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		System.out.print("Enter 2 numbers: ");
		x = sc.nextInt();
		y = sc.nextInt();
		int sum = x + y;
		System.out.println("The Sum is: " + sum);
	}
}
