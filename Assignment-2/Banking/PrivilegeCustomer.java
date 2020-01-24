class PrivilegeCustomer extends Customer {
  final static double creditLimit = 250000.00;

  @Override
  boolean isExceeded(double temp) {
    return (currLoan + temp >= creditLimit);
  }

  @Override
  void showLimit() {
    System.out.println("\nTHE LOAN LIMIT: " + creditLimit + "\n");
  }

  @Override
  void loanLeft(double temp) {
    System.out.println("\nREDEEMABLE LOAN AMOUNT " + (creditLimit - currLoan));
  }

  @Override
  void requestLoan() {
    while (true) {
      System.out.print("ENTER LOAN AMOUNT NEEDED: ");
      double temp = psc.nextDouble();
      if (temp < 0)
        break;
      else if (isExceeded(temp)) {
        System.out.println("THE ASKED LOAN EXCEEDS THE LIMIT");
        loanLeft(temp);
        System.out.println("[PRESS -1 TO EXIT]");
        continue;
      } else {
        currLoan += temp;
        break;
      }
    }
  }
}