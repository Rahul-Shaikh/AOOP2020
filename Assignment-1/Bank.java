import java.util.Scanner;

class Bank {
	public static void main(String[] args) {
		BankAcct ba = new BankAcct();
		ba.setValues();
		ba.showValues();
		BankAcct.showInterest();
		System.out.println("\nThe interest is " + ba.calInterest() + "\n");
		BankAcct.changeInterest();
		BankAcct.showInterest();
		System.out.println("\nThe interest is " + ba.calInterest() + "\n");
		
		BankAcct ba2 = new BankAcct();
		ba2.setValues();
		ba2.showValues();
		BankAcct.showInterest();
		System.out.println("\nThe interest is " + ba2.calInterest() + "\n");
		
	}
}

class BankAcct {
	int acctNum;
	float balance;
	static float intRate = 10.0F;
	private static Scanner psc = new Scanner(System.in);
	
	void setValues() {
		System.out.print("Enter The Account Number: ");
		acctNum = psc.nextInt();
		System.out.print("Enter Balance: ");
		balance = psc.nextFloat();
	}
	
	void showValues()
    {
    	System.out.println("--------------------------------------------------------------");
    	System.out.println("ACCOUNT NUMBER: " + acctNum);
    	System.out.println("BALANCE: " + balance);
    	System.out.println("--------------------------------------------------------------");
    }
    
    static void changeInterest() {
    	System.out.print("Enter the new Interest Rate: ");
    	intRate = psc.nextFloat();
    }
    
    static void showInterest() {
    	System.out.println("\nINTEREST RATE: " + intRate + "\n");
    }
    
    float getBalance() {
    	return balance;
    }
    
    float calInterest() {
    	float res = ((balance*intRate)/100);
    	return res;
    }
}
