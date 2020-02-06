import java.util.Scanner;

class Address {
  int premisesNum;
  String stName;
  String city;
  int pin;
  String state;
  private static Scanner psc = new Scanner(System.in);

  Address() {
    System.out.print("ENTER PREMISES NUMBER: ");
    this.premisesNum = psc.nextInt();
    psc.nextLine();
		System.out.print("ENTER STREET NAME: ");
    this.stName = psc.nextLine();
		System.out.print("ENTER CITY NAME: ");
    this.city = psc.nextLine();
		System.out.print("ENTER STATE NAME: ");
    this.state = psc.nextLine();
    System.out.print("ENTER PIN: "); 
    this.pin = psc.nextInt();
  }

  @Override
  public String toString() {
    return premisesNum + ", " + stName + ", " + city + ", " + state + ", " + pin;
  }
}