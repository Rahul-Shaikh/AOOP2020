import java.util.Scanner;

class Convert {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final float inchCon = 2.54F;
		final float footCon = 30.5F;
		
		System.out.print("Enter the height in CM: ");
		int height = sc.nextInt();
		int foot = (int)(height / footCon);
		height = (int)(height - (foot*footCon));
		int inch = (int)(height / inchCon);
		
		System.out.println("\nThe converted length is: " + foot + " ft " + inch + " inch. \n");
	}
}
