import java.util.Scanner;

class Address {
  String premisesNum;
  String stName;
  String city;
  int pin;
  String state;
  private static Scanner psc = new Scanner(System.in);

  Address() {
    System.out.println("--------ENTER ADDRESS-------");
    System.out.print("\tENTER PREMISES NUMBER: ");
    this.premisesNum = psc.nextLine();
	System.out.print("\tENTER STREET NAME: ");
    this.stName = psc.nextLine();
	System.out.print("\tENTER CITY NAME: ");
    this.city = psc.nextLine();
	System.out.print("\tENTER STATE NAME: ");
    this.state = psc.nextLine();
    System.out.print("\tENTER PIN: "); 
    this.pin = psc.nextInt();
    psc.nextLine();
  }

  void changePNum() {
    System.out.print("ENTER PREMISES NUMBER: ");
    this.premisesNum = psc.nextLine();
  }

  void changeStName() {
    System.out.print("ENTER STREET NAME: ");
    this.stName = psc.nextLine();
  }

  void changeCity() {
    System.out.print("ENTER CITY NAME: ");
    this.city = psc.nextLine();
  }

  void changeState() {
    System.out.print("ENTER STATE NAME: ");
    this.state = psc.nextLine();
  }

  void changePin() {
    System.out.print("ENTER PIN: "); 
    this.pin = psc.nextInt();
    psc.nextLine();
  }

  @Override
  public String toString() {
    return premisesNum + ", " + stName + ", " + city + ", " + state + ", " + pin;
  }
}
