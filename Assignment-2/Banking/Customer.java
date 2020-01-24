import java.util.Scanner;

abstract class Customer {
	static long lastid = 19001100;
	long cid;
	String name;
	double currLoan;
	String phNo;
	static protected Scanner psc = new Scanner(System.in);

	Customer() {
		cid = (++lastid);
	}

	void setValues() {
		System.out.print("ENTER NAME: ");
		name = psc.nextLine();
		System.out.print("ENTER PHONE NUMBER: ");
		phNo = psc.nextLine();
	}

	void showValues() { 
		System.out.println("\n--------------------------------------------");
		System.out.println("ID: " + cid);
		System.out.println("NAME: " + name);
		System.out.println("PHONE NUMBER: " + phNo);
		System.out.println("LOAN: " + currLoan);
		System.out.println("--------------------------------------------\n");
	}

	void payLoan() {
		while (true) {
			System.out.print("ENTER THE AMOUNT YOU WANNA PAY: ");
			double temp = psc.nextDouble();
			if (currLoan - temp < 0) {
				System.out.println("YOU ARE PAYING MORE THAN THE LOAN. PLEASE CORRECT.\n");
			}
			else {
				currLoan -= temp;
				break;
			}
		}
	}
	abstract void requestLoan();

	abstract boolean isExceeded(double temp);

	abstract void showLimit();

	abstract void loanLeft(double temp);
}
