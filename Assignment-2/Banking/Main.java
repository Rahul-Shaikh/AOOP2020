// import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		GenCustomer c = new GenCustomer();
		c.setValues();
		c.showValues();
		
		c.requestLoan();
		c.loanLeft(0);
		c.showValues();
		c.payLoan();
		c.showValues();
	}
}
